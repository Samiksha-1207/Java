public class Swap{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int temp;
        System.out.println("Before swapping the numbers were " + a + " and " + b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping the numbers are " +a + " and " + b );
    }
}
