package collectionProject;

import java.util.ArrayList;

public class ArrayIst {

	//static ArrayList<String> names = new ArrayList<>();
	// though it instance variable it can be used all the methods in this class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("Happy");
		names.add("Sad");
		names.add("Fun");
		names.add("Cool");
		
		System.out.println(names.get(0));
		
		//[Happy, Sad, Fun, Cool]
		System.out.println(names);
		
		System.out.println("**************");
		
		ArrayIst a = new ArrayIst();
		a.displayList(names);
		System.out.println("**************");
		a.removeNameByPosition(0,names);
		a.removeNameNyName("Cool",names);
		a.displayList(names);
		System.out.println("**************");
		if(a.searchName("Fun", names)) {
			a.modifyName(1, "Funny", names);
		}
		a.displayList(names);
	}
	
	void displayList(ArrayList<String> names) {
		for(String name: names) {
			System.out.println(name);
		}
	}
	
	void removeNameByPosition(int position, ArrayList<String> names) {
		names.remove(position);
	
	}
	void removeNameNyName(String Name, ArrayList<String> names) {
		names.remove(Name);
	}
	
	void modifyName(int position, String Name, ArrayList<String> names) {
		names.set(position, Name);
	}
	Boolean searchName(String Name, ArrayList<String> names) {
		if(names.contains(Name)) {
			return true;
		}
		return false;
	}

}
