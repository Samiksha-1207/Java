public class Armstrong_number {
    public static void main(String[] args) {
        int num = 153;
        int temp=num;
        int armstrong=0;
        while(num!=0)
        {
            int n = num %10;
            armstrong = armstrong + n*n*n;
            num/=10;
        }
        if(temp==armstrong)
            System.out.println("It is an armstrong number.");
        else
            System.out.println("It is not an armstrong number.");
    }
}
