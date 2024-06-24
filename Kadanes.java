public class Kadanes {
    static int KadanesAlgo(int arr[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            sum+= arr[i];
            max = Math.max(max, sum);

            if(sum == 0){
                sum= 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -2, 5};
        int maxSum = KadanesAlgo(arr);
        System.out.println("The sum is: "+maxSum);
    }
}
