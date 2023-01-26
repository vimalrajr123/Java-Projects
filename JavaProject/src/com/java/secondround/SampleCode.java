package com.java.secondround;

import java.util.ArrayList;
import java.util.List;

class SingletonClass implements Cloneable {
	static int count = 0;
	static int subount = 1;
	static List<SingletonClass> list = new ArrayList<>();

	private SingletonClass() {
		// why not making all indexes // foreign key // \
	}

	public static SingletonClass getObject() {
		count++;
		if (count <= 5) {
			subount++;
			SingletonClass singgle = new SingletonClass();
			list.add(singgle);
			return singgle;
		} else {

			if (subount > 5) {
				subount = 1;
			}

			int temp = subount;
			SingletonClass singgle1 = list.get(temp - 1);
			subount++;
			return singgle1;

		}
	}
}

public class SampleCode {

	public static void main(String[] args) throws CloneNotSupportedException {

		SingletonClass s1 = SingletonClass.getObject();
		SingletonClass s2 = SingletonClass.getObject();
		SingletonClass s3 = SingletonClass.getObject();
		SingletonClass s4 = SingletonClass.getObject();
		SingletonClass s5 = SingletonClass.getObject();
		SingletonClass s6 = SingletonClass.getObject();
		SingletonClass s7 = SingletonClass.getObject();
		SingletonClass s8 = SingletonClass.getObject();
		SingletonClass s9 = SingletonClass.getObject();
		SingletonClass s10 = SingletonClass.getObject();
		SingletonClass s11 = SingletonClass.getObject();
		SingletonClass s12 = SingletonClass.getObject();

		System.out.print(s1.hashCode() + " ");
		System.out.print(s2.hashCode() + " ");
		System.out.print(s3.hashCode() + " ");
		System.out.print(s4.hashCode() + " ");
		System.out.print(s5.hashCode() + " ");
		System.out.println("***************");
		System.out.println("");
		System.out.print(s6.hashCode() + " ");
		System.out.print(s7.hashCode() + " ");
		System.out.print(s8.hashCode() + " ");
		System.out.print(s9.hashCode() + " ");
		System.out.print(s10.hashCode() + " ");
		System.out.println("***************");
		System.out.println("");
		System.out.print(s11.hashCode() + " ");
		System.out.print(s12.hashCode() + " ");

	}

}
