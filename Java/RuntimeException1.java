
public class RuntimeException1 {

	public static void main(String[] args) {
		int x=5;
		int y=0;
		try{
			System.out.println(x/y);
		}
		catch(ArithmeticException ae) {
			System.out.println("You can not divide by zero.");
		}
		System.out.println("The End");

	}

}
