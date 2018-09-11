package com.study.jsp.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.study.jsp.BDao;
import com.study.jsp.BDto;
import com.study.jsp.BPageInfo;

public class BListCommand implements BCommand {

	// list.do를 부르면 이쪽으로 넘어옴.
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int nPage = 1;
		try {
			String sPage = request.getParameter("page");
			nPage = Integer.parseInt(sPage);
		} catch (Exception e) {
		}

		BDao dao = BDao.getInstance();
		// Bean으로 쓸 페이지 클래스를 만들어야함 (BDto 수정하기)
		BPageInfo pinfo = dao.articlePage(nPage);
		request.setAttribute("page", pinfo);

		HttpSession session = null;
		session = request.getSession();
		session.setAttribute("cpage", nPage);

		ArrayList<BDto> dtos = dao.list(nPage, request);
		request.setAttribute("list", dtos);

	}

}
