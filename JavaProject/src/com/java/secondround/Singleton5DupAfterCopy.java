package com.java.secondround;

import java.util.ArrayList;
import java.util.List;

class Sing {
	private Sing() {
	}

	static int count = 0;
	static int subCount = 1;
	static List<Sing> list = new ArrayList<>();

	static Sing getObject() {
		count++;
		if (count <= 5) {
			Sing obj = new Sing();
			list.add(obj);
			subCount++;
			return obj;
		} else {

			if (subCount > 5) {
				subCount = 1;
			}
			int temp = subCount;

			Sing obj = list.get(temp - 1);
			subCount++;
			return obj;

		}
	}
}

public class Singleton5DupAfterCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sing s1 = Sing.getObject();
		Sing s2 = Sing.getObject();
		Sing s3 = Sing.getObject();
		Sing s4 = Sing.getObject();
		Sing s5 = Sing.getObject();
		Sing s6 = Sing.getObject();
		Sing s7 = Sing.getObject();
		Sing s8 = Sing.getObject();
		Sing s9 = Sing.getObject();
		Sing s10 = Sing.getObject();

		System.out.print(s1.hashCode() + " ");
		System.out.print(s2.hashCode() + " ");
		System.out.print(s3.hashCode() + " ");
		System.out.print(s4.hashCode() + " ");
		System.out.print(s5.hashCode() + " ");
		System.out.println(" ****************** ");
		System.out.println("");
		System.out.print(s6.hashCode() + " ");
		System.out.print(s7.hashCode() + " ");
		System.out.print(s8.hashCode() + " ");
		System.out.print(s9.hashCode() + " ");
		System.out.print(s10.hashCode() + " ");

	}

}
