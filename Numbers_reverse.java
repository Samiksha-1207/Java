public class Numbers_reverse {
      public static void main(String[] args) {
      int number = 1234567;
      int temp = number;
      int rev=0;

      while(number!=0) {
         int n = number % 10;
         rev = n + rev * 10;
         number/=10;
      }

      System.out.println("The number before reverse is: " + temp);
      System.out.println("The number after reverse is: " + rev);
   }
}
