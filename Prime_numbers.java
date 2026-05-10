
public class Prime_numbers {
    public static void main(String[] args) {
        {
            int a=9;
            int flag=0;
            for(int i=2;i<a;i++)
            {
                if(a%i==0)
                {
                    flag++;
                }
            }
            if(flag>=1)
                System.out.println("It is not a prime number.");
            else
                System.out.println("It is a prime number");
        }
    }
}
