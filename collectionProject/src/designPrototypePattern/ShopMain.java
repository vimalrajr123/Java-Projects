package designPrototypePattern;

public class ShopMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		ShopDTO s1 = new ShopDTO(1001, "shop1");
		//ShopDTO s2 = new ShopDTO(1002, "shop2");
		
//		Prototype pattern is to clone the Object itslf
//		eg: whenever new shop is created - assume the bookList is comming from Database then each time the 
//		same bookList need to fetch from DB
//		to avoid that we can clone the Previous Object and make reuse of it.
//			
//			shallow cloning - one reference point to multiple object.(change in object reflect in all )
//			deep cloning - multiple reference to multiple object.(change in object will reflect only in that object)
			
		
		
		ShopDTO s2 = (ShopDTO) s1.clone();
		s2.setShopId(1002);
		s2.setShopName("shop2");
		s1.getBook().remove(2);
		
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
