public class Methlarge{
    static int findlarge(int a, int b, int c){
        if(a>b &a>c)
            return a;

        else if(b>a &b>c)
            return b;

        else 
        return c;    
        
    }
    public static void main(String[] args){
        int a=10,b=5,c=6;
        int large=findlarge(a,b,c);
        System.out.println("The large is"+ large);
    }
   
}