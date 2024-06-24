import java.util.Arrays;

public class Kthsmallest {
    static int kthsmall(int arr[], int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
       int arr[] = {2, 5, 8, 11, 3, 6};
       int k= 2;
       System.out.println(k+"th smallest elements is: "+kthsmall(arr, k)); 
    }
}
