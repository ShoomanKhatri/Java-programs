
public class TOH1 {
	public static void TOH(int n,char from,char to,char aux) {
		   if(n>0) {
		      TOH(n-1,from,aux,to);
		      System.out.println( "Move disk" + n +"from" + from + "to" + to);
		      TOH(n-1,aux,to,from);
		   }
		}
		public static void  main(String args[]) {
		   int n=3;
		   TOH(n,'A','B','C');
		} 

}
