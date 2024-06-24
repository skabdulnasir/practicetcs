public class kthLargest {
    public static void main(String[] args) {
        int arr[] = {12, 10, 15, 18, 11};
        int k = 2;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
            if(i == k-1){
                System.out.println("The k th largest element is: "+arr[i]);
            }
        }
    }
}
