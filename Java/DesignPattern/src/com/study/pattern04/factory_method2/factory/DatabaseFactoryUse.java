package com.study.pattern04.factory_method2.factory;

import com.study.pattern04.factory_method2.database.Database;
import com.study.pattern04.factory_method2.database.Informix;
import com.study.pattern04.factory_method2.database.MySQL;
import com.study.pattern04.factory_method2.database.Oracle;

public class DatabaseFactoryUse extends DatabaseFactory {
	
	// �̹��� ����� �����ͺ��̽��� Oracle�̴�.
	// �����ͺ��̽� ����� ���⼭ Ÿ���� �����Ѵ�.
	public DBType dbtype = DBType.Oracle;   // enum�� ���� ������ ��

	@Override
	public Database setDatabase() {
		// ȸ�� ������ ���� � �����ͺ��̽��� �ٽ� ������� �𸥴�.
		// �׷��� ������ ������ ������ �ʰ� ����ø� ����Ѵ�.
		if(dbType == DBType.MySQL) {
			System.out.println("MySQL use...");
			return new MySQL();
		}
		else if(dbType == DBType.Oracle) {
			System.out.println("Oracle use...");
			return new Oracle();
		}
		else if(dbType == DBType.Informix) {
			System.out.println("Informix use...");
			return new Informix();
		}
		
		return null;
	}

}
