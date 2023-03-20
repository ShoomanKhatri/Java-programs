
public class PowerRecur {
	public static int power(int x, int y) {
		if(y==0)
			return 1;
		else
			return x*power(x,y-1);
	}
	public static void main(String args[]) {
		int a=5,b=3;
		int p=power(a,b);
		System.out.println(a+" power"+b+"is"+p);
		
	}

}
