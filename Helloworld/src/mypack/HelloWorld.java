package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import org.w3c.dom.Node;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //  public static void checkMagazine(List<String> magazine, List<String> note) {
	
		String m ="give me one grand today night";
		String n = "give one grand today";
		List<String> magazine = new ArrayList<>();
		List<String> note   = new ArrayList<>();
		
			    boolean xx = true;
			for(String word: note){
			    
			    if (magazine.contains(note)){    
			        magazine.remove(word);     
			    }
			    else{
			        xx= false;
			        break;      
			}
			}
			if(xx){
			    
			    System.out.println("Yes");
			}
			else{
			     System.out.println("No");
			}
			    }


	}

