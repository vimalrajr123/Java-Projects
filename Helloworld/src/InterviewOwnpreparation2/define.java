package InterviewOwnpreparation2;

public class define {
	int id;
	String name;
	String degsignation;
	int salary;

	public define(int id, String name, String degsignation, int salary) {
		this.id = id;
		this.name = name;
		this.degsignation = degsignation;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegsignation() {
		return degsignation;
	}
	public void setDegsignation(String degsignation) {
		this.degsignation = degsignation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
