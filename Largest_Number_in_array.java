public class Largest_Number_in_array {
    public static void main(String[] args) {
        int arr[]={10,40,2,4,6,30,330};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println("The largest is: " + max);
    }
}
