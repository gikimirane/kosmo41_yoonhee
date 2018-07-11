package com.study.pattern04.stretegy3;

public class Main {

	public static void main(String[] args) {
		// 데이터베이스를 전략적으로 선택하여 사용한다.
		DatabaseUse myDB = new DatabaseUse();
		myDB.Connect();
		
		myDB.setDatabase(new MySQL());
		myDB.Connect();
		
		myDB.setDatabase(new Oracle());
		myDB.Connect();
		
		myDB.setDatabase(new Informix());
		myDB.Connect();
		
	}

}
