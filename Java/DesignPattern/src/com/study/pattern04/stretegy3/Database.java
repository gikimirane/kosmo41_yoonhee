package com.study.pattern04.stretegy3;

public abstract class Database {
	
	public String name;
	public double rows;
	
	//�����ͺ��̽����� ���� ����� �ٸ���
	public abstract void connectDatabase();
}
