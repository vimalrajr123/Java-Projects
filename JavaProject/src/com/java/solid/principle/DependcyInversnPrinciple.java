package com.java.solid.principle;

import java.util.ArrayList;
import java.util.List;

class DependcyInversnPrinciple {

	public static void main(String[] args) {
		
		List<Developer> list = new ArrayList<>();
		list.add(new FrontEndDeveloper());
		list.add(new BackEndDeveloper());
		Project p = new Project(list);
		p.implement();
		// TODO Auto-generated method stub

	}

}
