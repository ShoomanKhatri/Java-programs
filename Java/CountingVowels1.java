public class CountingVowels1 {
   public static void main(String args[]){
      int count = 0;
      String s="we are people.";
      for (int i=0 ; i<s.length(); i++){
         char ch = s.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
            count ++;
         }
      }
      System.out.println("Number of vowels in the given sentence is "+count);
   }
}