package com.study.pattern04.stretegy3;

public class Main {

	public static void main(String[] args) {
		// �����ͺ��̽��� ���������� �����Ͽ� ����Ѵ�.
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
