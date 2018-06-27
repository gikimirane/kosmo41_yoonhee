class AccessWay {
	static int num = 0;
	
	AccessWay() { incrCnt(); }
	void incrCnt() {
		num++;    //클래스 내부에서 이름을 통한 접근
	}
}

class ClassVarAccess {
	public static void main(String[] args) {
		// 인스턴스의 이름을 통한 접근
		AccessWay way = new AccessWay();
		way.num++;
		System.out.println("num = " + way.num);
		
		// 클래스의 이름을 통한 접근
		AccessWay.num++;
		System.out.println("num + " + AccessWay.num);
	}
}