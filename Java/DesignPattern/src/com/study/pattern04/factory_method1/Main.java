package com.study.pattern04.factory_method1;

import java.util.List;

import com.study.pattern04.factory_method1.factory.PatternAGenerator;
import com.study.pattern04.factory_method1.factory.PatternBGenerator;
import com.study.pattern04.factory_method1.factory.UnitGenerator;
import com.study.pattern04.factory_method1.unit.Unit;

public class Main {

	public static void main(String[] args) {
		// Ÿ���� �� ���� �ִٴ� �͸� �ȴ�.
		UnitGenerator[] unitGenerators = new UnitGenerator[2];
		unitGenerators[0] = new PatternAGenerator();   //�ڽ��� �θ����� �־���
		unitGenerators[1] = new PatternBGenerator();
		
//		DoMakeType(unitGenerators[0]);
		DoMakeType(unitGenerators[1]);
	}
	
	public static void DoMakeType(UnitGenerator ug) {
		// ������ ��������� ���⼭�� �𸥴�
		ug.createUnits();
		
		List<Unit> units = ug.getUnits();
		for(Unit unit : units) {
			unit.attack();
		}
	}

}
