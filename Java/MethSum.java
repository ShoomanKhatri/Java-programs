
public class MethSum {
	public int sum(int x, int y)
	{
		return (x+y);
	}
	public int sum(int x, int y, int z)
	{
		return(x+y+z);
	}
	public double sum(double x, double y)
	{
		return(x+y);
	}

    public static void main(String args[])
    {
    	MethSum a= new MethSum();
    	System.out.println(a.sum(10,20));
    	System.out.println(a.sum(10,20,30));
    	System.out.println(a.sum(10.5,20.5));
    }
}
    
