package com.study.pattern04.stretegy3;

public class Oracle extends Database {
	Oracle() {
		name = "Oracle";
		rows = 10;
	}

	@Override
	public void connectDatabase() {
		System.out.println(name + "에 접속했습니다.");

	}

}
