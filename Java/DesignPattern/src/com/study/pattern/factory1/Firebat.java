package com.study.pattern.factory1;

public class Firebat implements Unit {
	
	public Firebat() {
		System.out.println("���̾�� ���� !!!");
	}

	@Override
	public void move() {
		System.out.println("���̾�� �̵� !!!");
	}

}
