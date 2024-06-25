public class BinarysquareRoot {
    static int calsqrt(int num){
        int low = 0;
        int high = num;
        while(low <= high){
            int mid = (low + high)/2;
            int square = mid * mid;
            if(square == num){
                return mid;
            } else if(square < num){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = 36;
        System.out.println("The sqaure root is: "+calsqrt(n));
    }
}
