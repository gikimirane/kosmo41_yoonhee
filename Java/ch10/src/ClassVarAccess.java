class AccessWay {
	static int num = 0;
	
	AccessWay() { incrCnt(); }
	void incrCnt() {
		num++;    //Ŭ���� ���ο��� �̸��� ���� ����
	}
}

class ClassVarAccess {
	public static void main(String[] args) {
		// �ν��Ͻ��� �̸��� ���� ����
		AccessWay way = new AccessWay();
		way.num++;
		System.out.println("num = " + way.num);
		
		// Ŭ������ �̸��� ���� ����
		AccessWay.num++;
		System.out.println("num + " + AccessWay.num);
	}
}