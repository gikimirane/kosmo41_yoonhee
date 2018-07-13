package com.study.pattern04.factory_method1.unit;

//<Summary>
//Marine 'ConcreteProduct'  class
//</Summary>

public class Marine extends Unit {
	
	public Marine() {
		type = UnitType.Marine;
		name = "Marine";
		hp = 100;
		exp = 50;
		
		System.out.println(this.name + "���� !!!");
	}

	@Override
	public void attack() {
		System.out.println(this.name + "���� !!!");

	}

}
