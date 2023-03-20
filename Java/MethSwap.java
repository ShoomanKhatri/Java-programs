
public class MethSwap {
	public static void swap(int x, int y)
	{
		int c=x;
		 x=y;
		 y=c;
		System.out.println("Values of x and y are"+x+"and"+y);
		
	}
	public static void man(String args[]) {
		int a=3;
		int b=4;
		swap(a,b);
	}

}
