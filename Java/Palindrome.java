// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Palindrome{
    public static void main(String[] args) {
        int n=351;
        int temp=n;
        int rev=0;
        int digit;
        while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(temp==rev){
           System.out.println("palindrome.");
        }else{
        System.out.println("Not palindrome");
        }
    }
}