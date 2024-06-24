import java.util.*;
class binarySearch{
    public static int binary(int arr[], int n, int target){
        int left =0, right = n-1;
        while(left<=right){
            int mid = (left + right) / 2;
            if(target == arr[mid]){
                return mid;
            } else if (target < arr[mid]){
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int result = binary(arr, n, target);
        System.out.println(result);
    }
}