
public class CountingVowels {
	// Java Program to Count Number of Vowels
	// in a String in a iterative way

		public static void main(String[] args){
			String s = "we are people.";
			s = s.toLowerCase();
			int count = 0;

			for (int i = 0; i < s.length(); i++) {
				// check if char[i] is vowel
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'i'
					|| s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
					// count increments if there is vowel in
					// char[i]
					count++;
				}
			}

			// display total count of vowels in string
			System.out.println(
				"Total no of vowels in string are: " + count);
		}
}
