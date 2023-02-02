package designBuilderPattern;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Builder pattern is used to build on top of the same object
//		eg usage whenever you know the information you can add the information on top of it
//		** no need to remember the order of the datamember in the constructor 
//		** no need to create the contrustor with all the data members.
//		** create multiple setter to assign the data member to assign on the same object by returing the object evertime.
//		and have a getter method to get all the datamember of the object.
		
		phoneDTO phone = new phoneDTO();
		phone.setModel(1000);
		phone.setOs("android");
		phone.setSize(16);
		phone.setVersion(22);
		
		phone.getPhone();

	}

}
