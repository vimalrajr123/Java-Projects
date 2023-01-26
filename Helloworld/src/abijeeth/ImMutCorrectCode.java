package abijeeth;

import java.util.*;

public final class ImMutCorrectCode {

	private final int id;
	private final int age;
	private final List<Integer> salary;

	public ImMutCorrectCode(int id, int age, List<Integer> salary) {
		super();
		this.id = id;
		this.age = age;
		List<Integer> salaryTemp = new ArrayList<>();
		salaryTemp.addAll(salary);
		this.salary = salaryTemp;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public List<Integer> getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> in = new ArrayList<Integer>();
		in.add(1);
		in.add(2);
		ImMutCorrectCode mut = new ImMutCorrectCode(1, 2, in);

		System.out.println(mut.getSalary());

		in.add(3);
		in.add(5);
		System.out.println(mut.getSalary());

	}

}
