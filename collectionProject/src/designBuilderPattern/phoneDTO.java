package designBuilderPattern;

public class phoneDTO {
	
	private int model;
	private String os;
	private int version;
	private int size;
	
	public phoneDTO setModel(int model) {
		this.model = model;
		return this;
	}
	
	public phoneDTO setOs(String os) {
		this.os = os;
		return this;
	}
	
	public phoneDTO setVersion(int version) {
		this.version = version;
		return this;
	}
	
	public phoneDTO setSize(int size) {
		this.size = size;
		return this;
	}
	
	public void getPhone() {
		System.out.println(model+" "+os+" "+version+" "+size);
	}
	
	

	
	
	
}
