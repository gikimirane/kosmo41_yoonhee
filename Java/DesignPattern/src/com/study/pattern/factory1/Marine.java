package com.study.pattern.factory1;

public class Marine implements Unit {
	
	public Marine() {
		System.out.println("���� ����!!!");
	}

	@Override
	public void move() {
		System.out.println("���� �̵�!!!");
	}

}
