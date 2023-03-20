public class CountLetter{
	public static void main(String args[]) {
		String s=" Who is University topper";
		int count=0;
		for(char ch : s.toCharArray()) {
	         if(ch=='i')
	        	 count++;
		}
		System.out.println("Number of character is:"+count);
	}
}