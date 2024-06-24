import java.util.Scanner;
public class binarySearchRecursive {
    public static int binaryRecursive(int arr[], int right, int left, int target){
        while (left<=right){
            int mid =(left + right)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target < mid){
                return binaryRecursive(arr, mid-1, left, target);
            } else{
                return binaryRecursive(arr, right, mid+1, target);
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int result = binaryRecursive(arr, n-1, 0, target);
        System.out.println(result);
    }
}
