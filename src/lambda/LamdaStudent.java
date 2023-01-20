package lambda;

public class LamdaStudent {

	
	private int id;
	private String name;
	private int salary;
	/**
	 * @param id
	 * @param name
	 * @param salary
	 */
	public LamdaStudent(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "LamdaStudent [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
