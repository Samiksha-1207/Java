public class Sum_Of_Digits {
    public static void main(String[] args) {
        int number = 12345;
        int sum=0;
        while(number!=0)
        {
            int n=number%10;
            sum = sum + n ; 
            number/=10;
        }
        System.out.println("The sum is: " + sum);
    }
}
