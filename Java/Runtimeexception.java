
public class Runtimeexception {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		
		try {
			System.out.println(a.length);
			System.out.println(a[0]);
			System.out.println(a[4]);
			System.out.println(a[5]);
		    } 
		catch(Exception e) {
				
				System.out.println("Exception" + e.getLocalizedMessage());
			}
		finally {
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
		}
		
	}

}
