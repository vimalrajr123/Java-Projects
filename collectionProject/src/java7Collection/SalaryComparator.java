package java7Collection;

import java.util.Comparator;

public class SalaryComparator implements Comparator<StudentComparator> {

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary() == o2.getSalary())
			return 0;
		
		else if (o1.getSalary() > o2.getSalary())
			return 1;
		
		else
			return -1;
	}
	

}
