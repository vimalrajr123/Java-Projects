package java7Collection;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentComparator> {

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {

		return o1.getName().compareTo(o2.getName());
	}

}
