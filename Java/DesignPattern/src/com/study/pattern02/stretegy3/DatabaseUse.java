package com.study.pattern02.stretegy3;

public class DatabaseUse {
	// ������
	private Database db;
	
	// �����ͺ��̽� ��ȯ �����ϰ�
	public void setDatabase(Database db) {
		this.db = db;
	}
	
	// ��� ���
	public void Connect() {
		if (db == null) {
			System.out.println("�����ͺ��̽��� �����ϼ���.");
		} else {
			// Delegate �޼ҵ� ȣ�� : ��ü���� �����ͺ��̽��� ������ ���� ��� ����
			db.connectDatabase();
		}
	}
}
