public class String_reverse {
    public static void main(String[] args) {
        String sr="Samiksha";
        String reversed =new StringBuilder(sr).reverse().toString();
        System.out.println("The string was: " + sr);
        System.out.println("The reversed string is: " + reversed);
    }
}
