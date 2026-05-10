public class Palindrome {
    public static void main(String[] args)
    {
        int a=12321;
        int temp=a;
        int palindrome=0;
        while(a!=0)
        {
            int n=a%10;
            palindrome=palindrome*10+n;
            a/=10;
        }
        if(temp==palindrome)
            System.out.println("It is a palindrome.");
        else
            System.out.println("It is not a palindrome.");
    }
}
