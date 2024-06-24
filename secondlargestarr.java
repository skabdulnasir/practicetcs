public class secondlargestarr {
    static void print2ndLargest(int arr[]){
        int second_largest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        if(arr.length<2){
            System.out.println();
            return;
        }
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] != largest){
                second_largest = Math.max(second_largest, arr[i]);
            }  
        }
        System.out.println("2nd largest is: "+second_largest);
    }
    public static void main(String[] args) {
        int arr[] = {10, 12, 15, 5, 11, 17};
        print2ndLargest(arr);
    }
}
