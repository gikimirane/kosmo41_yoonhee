
public class BuildString
{
	public static void main(String[] args)
	{
		StringBuilder stbuf = new StringBuilder("123");
        // 문자열 "123"이 저장된 인스턴스의 생성		
		stbuf.append(45678);
		System.out.println(stbuf.toString());    //문자열 덧붙이기
		
		stbuf.delete(0,2);
		System.out.println(stbuf.toString());    //문자열 일부 삭제
		
		stbuf.replace(0,3, "AB");
		System.out.println(stbuf.toString());    //문자열 일부 교체
		
		stbuf.reverse();
		System.out.println(stbuf.toString());    //문자열 내용 뒤집기
		
		String sub = stbuf.substring(2, 4);    //일부만 문자열로 반환
		System.out.println(sub);
	}
}
