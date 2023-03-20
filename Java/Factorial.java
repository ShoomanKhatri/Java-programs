
public class Factorial {
	public static int fact(int n){
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String args[]) {
		int f;
		int n=5;
		f=fact(n);
		System.out.println("The factorial of" +n +"is" + f);
		
	}

}
