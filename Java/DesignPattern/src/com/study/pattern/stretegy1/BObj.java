package com.study.pattern.stretegy1;

public class BObj {
	
	AInterface ainter;
	
	public BObj() {
		// ainter = new AImplement();
	}
	
	public void SomeFunc() {
		// ���� ����� �ʿ��մϴ�. A�� ����� �ּ���.
		// �̷��� ��� ������ ����(Delegate�ߴ�.)
		
		// System.out.println("AAA");
		// System.out.println("AAA");
		// System.out.println("AAA");
		
		//Delegate ���
		ainter.funcA();
		ainter.funcA();
		ainter.funcA();
	}
}
