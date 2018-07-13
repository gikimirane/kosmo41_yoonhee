package com.study.pattern04.factory_method2.database;

// <Summary>
// The 'Product' abstract class
// </Summary>

public abstract class Database {
	public String name;
	public double rows;
	
	//�����ͺ��̽����� ���� ����� �ٸ���.
	public abstract void connectDatabase();
	
	//ǥ�� SQL���� ����Ѵ�. (����ó�� ����� ����.)
	public void insertData() {
		System.out.println(name + "�� �����͸� �߰��߽��ϴ�.");
	}
	public void selectData() {
		System.out.println(name + "���� �����͸�" + rows + "�� ��ȸ�߽��ϴ�.");
	}
}
