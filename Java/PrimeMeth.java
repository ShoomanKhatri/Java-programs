public class PrimeMeth{    
    static void checkPrime(int n){  
      int i,m=0,flag=0;      
      m=n/2;      
      if(n==0||n==1){  
        //nothing
             
      }else{  
       for(i=2;i<=m;i++){      
        if(n%i==0){      
             
         flag=1;      
         break;      
        }      
       }      
       if(flag==0)  { System.out.println(n+" is prime number"); }  
      } 
    }  
    public static void main(String args[]){ 
         for(int i=20;i<=50;i++){
           checkPrime(i);
        }    
    } 
}