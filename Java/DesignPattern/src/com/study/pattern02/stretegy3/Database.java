package com.study.pattern02.stretegy3;

public abstract class Database {
	
	public String name;
	public double rows;
	
	//�����ͺ��̽����� ���� ����� �ٸ���
	public abstract void connectDatabase();
}
