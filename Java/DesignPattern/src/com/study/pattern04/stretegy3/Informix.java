package com.study.pattern04.stretegy3;

public class Informix extends Database {
	Informix() {
		name = "Informix";
		rows = 40;
	}

	@Override
	public void connectDatabase() {
		System.out.println(name + "�� �����߽��ϴ�.");

	}

}
