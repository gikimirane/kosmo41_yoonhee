package com.study.pattern.factory1;

public class Medic implements Unit {
	
	public Medic() {
		System.out.println("�޵� ���� !!!");
	}

	@Override
	public void move() {
		System.out.println("�޵� �̵� !!!");

	}

}
