package com.study.pattern04.factory_method2.database;

//<Summary>
//C 'ConcreteCreator' class
//</Summary>

public class Informix extends Database {
	
	public Informix() {
		name = "Informix";
		rows = 20;

	@Override
	public void connectDatabase() {
		System.out.println(name + "�� �����߽��ϴ�.");

	}

}
