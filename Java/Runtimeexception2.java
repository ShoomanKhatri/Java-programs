
public class Runtimeexception2 {

	public static void main(String[] args) {
	int[] array= {20,9,8,7,100};
	try{
		for(int i=0;i<=array.length;i++) {
	
		System.out.println(array[i]);
	    }
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Reached the end of the array.");
	}

	}

}
