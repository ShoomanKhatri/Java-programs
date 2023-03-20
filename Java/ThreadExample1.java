
public class ThreadExample1 extends Thread{
	public void run()
	{
		int a=10;
		int b=12;
		int result=a+b;
		System.out.println("Thread started running.");
		System.out.println("The sum of two numbers is"+result);
	}
	public static void main(String args[]) {
		ThreadExample1 t1 =new ThreadExample1();
		t1.start();
		
		ThreadExample1 t2 =new ThreadExample1();
		t2.start();
		
		ThreadExample1 t3 =new ThreadExample1();
		t3.start();
		
		ThreadExample1 t4 =new ThreadExample1();
		t4.start();
	}

}
