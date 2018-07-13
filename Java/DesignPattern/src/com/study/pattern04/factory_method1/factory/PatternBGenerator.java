package com.study.pattern04.factory_method1.factory;

import com.study.pattern04.factory_method1.unit.Firebat;
import com.study.pattern04.factory_method1.unit.Marine;

//<Summary>
//A 'ConcreteCreator' class
//</Summary>

public class PatternBGenerator extends UnitGenerator {

	@Override
	public void createUnits() {
		units.add(new Firebat());
		units.add(new Firebat());
		units.add(new Firebat());
		units.add(new Firebat());
		units.add(new Marine());
		units.add(new Marine());
		units.add(new Marine());
		units.add(new Marine());
		units.add(new Marine());
		units.add(new Marine());

	}

}
