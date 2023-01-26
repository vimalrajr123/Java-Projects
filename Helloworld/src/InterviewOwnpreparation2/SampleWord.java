package InterviewOwnpreparation2;

import java.util.HashSet;
import java.util.Set;

public class SampleWord {

	public static void main(String[] args) {

		String str = "hi are hi you , you really great";

		String[] words = str.split(" ");
		int count;
		Set<String> set = new HashSet<>();

		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {

					set.add(words[i]);
				}

				
			}

		}
		
		System.out.println(set);
	}
}
