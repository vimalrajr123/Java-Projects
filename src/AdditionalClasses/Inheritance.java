package AdditionalClasses;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalParent a= new AnimalParent();
		ReptileChild r = new ReptileChild();
		CrocodileChild c = new CrocodileChild(10, 100, "Hard");
		
		System.out.println(c.getHeight()+"\n"+c.getBloodType()+"\n"+c.getEggType());
		
		System.out.println(c.toString());
		

	}

}
