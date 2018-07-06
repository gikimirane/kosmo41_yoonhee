package com.study.pattern.factory1;

enum UnitType {
	Marine,
	Firebat,
	Medic
}

public class UnitFactory {
	
	public static Unit createUnit(UnitType type) {
		Unit unit = null;
		
		switch (type) {
		case Marine:
			// ��ü���� ���� ����� �����Ͽ� �����Ѵ�.
			// ������ �Ķ���Ͱ� �ִٸ� �����ڿ� �߰��� ���� �ִ�.
			unit = new Marine();
			break;
		case Firebat:
			unit = new Firebat();
			break;
		case Medic:
			unit = new Medic();
			break;
		}
		return unit;
	}
}
