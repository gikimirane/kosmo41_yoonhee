package com.study.pattern04.factory_method2;

import com.study.pattern04.factory_method2.database.Database;
import com.study.pattern04.factory_method2.factory.DatabaseFactory;
import com.study.pattern04.factory_method2.factory.DatabaseFactoryUse;

public class Main {

	public static void main(String[] args) {
		DatabaseFactory factory = new DatabaseFactoryUse();
		
		// � �����ͺ��̽��� ������ ���⼭�� �𸥴�.
		// ���丮 �޼��忡�� �����Ǵ� �����ͺ��̽��� �׳� ����Ѵ�.
		Database db = factory.setDatabase();
		
		// �����ͺ��̽��� ����
		db.connectDatabase();
		
		//���ӵ� �����ͺ��̽��� �̿��� ����ó���� �Ѵ�.
		db.insertData();
		db.selectData();

	}

}
