package abijeeth;

import java.util.*;
import java.util.Map.Entry;

public final class ImMutCorrectCodeWithMap {

	private final int id;
	private final int age;
	private final HashMap<Integer, Integer> salary;

	public ImMutCorrectCodeWithMap(int id, int age, HashMap<Integer, Integer> salary) {
		super();
		this.id = id;
		this.age = age;
		// this.salary = salary;

		HashMap<Integer, Integer> salaryTemp = new HashMap<Integer, Integer>();
		for (Entry<Integer, Integer> e : salary.entrySet()) {
			salaryTemp.put(e.getKey(), e.getValue());
		}
		this.salary = salaryTemp;

	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public HashMap<Integer, Integer> getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> in = new HashMap<Integer, Integer>();
		in.put(1, 1);
		in.put(2, 2);
		ImMutCorrectCodeWithMap mut = new ImMutCorrectCodeWithMap(1, 2, in);

		System.out.println(mut.getSalary());

		in.put(3, 2);
		System.out.println(mut.getSalary());

	}

}
