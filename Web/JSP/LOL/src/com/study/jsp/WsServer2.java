package com.study.jsp;

import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 * sessions가 각 호출 시 마다 생성되므로 static으로 정해 줘야 한다.
 * 브라우저가 websocket을 지원해야 한다.
 * 웹 소켓 연결 후 별도 close 동작 없이 브라우저를 닫을 경우 자동으로 OnClose가 호출된다.
 */

@ServerEndpoint("/websocketendpoint2")
public class WsServer2 {
	
	// HashMap역할을 하는 Sessions
	private static final java.util.Set<Session> sessions =
			java.util.Collections.synchronizedSet(new java.util.HashSet<Session>());
	
	/**
	 * @OnOpen allows us to intercept the creation of a new session.
	 * The session class allows us to send data to the user.
	 * In the method onOpen, we'll let the user know that the handshake was successful.
	 */
	
	@OnOpen
	// 사용자가 들어오면 OnOpen
	public void onOpen(Session session){
		System.out.println("Open session id : " + session.getId());
		
		try {
			final Basic basic = session.getBasicRemote();
			basic.sendText("Connection Established");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		sessions.add(session);
	}
	
	@OnClose
	// 사용자가 나가면 OnClose
	public void onClose(Session session){
		System.out.println("Session " +session.getId()+" has ended");
		sessions.remove(session);
	}
	
	/**
	 * when a user sends a message to the server,
	 * this method will intercept the message and allow us to react to it.
	 * For now the message is read as a String.
	 */
	
	@OnMessage
	// 서버가 돌면서 사용자 데이터를 받는 것?
	public void onMessage(String message, Session session){
		System.out.println("Message from " + session.getId() + ": " + message);
		// 이쪽은 내가 메세지를 보낸 것만!
		try {
			final Basic basic = session.getBasicRemote();
			basic.sendText("to : " + message);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		// 상대방이 메세지를 쓴 것은 이쪽!
		sendAllSessionToMessage( session, message );
	}
	
	/**
	 * 모든 사용자에게 메시지를 전달한다.
	 */
	
	private void sendAllSessionToMessage(Session self, String message) {
		try {
			for( Session session : WsServer2.sessions ) {
				if(! self.getId().equals(session.getId()) )
					session.getBasicRemote().sendText("All : " + message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@OnError
	public void onError(Throwable e, Session session){
	}

}
