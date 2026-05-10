public class Linear_Search {
    public static void main(String[] args) {
        int arr[]={122,34,545,652,23,231,345};
        int target=231;
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
                System.out.println("The target is present at: " + i );
        }
    }
}
