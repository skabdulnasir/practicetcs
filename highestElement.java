public class highestElement {
    static void printhighestelement(int arr[]){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The highest element is : "+max);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 250, 14, 98, 249};
        printhighestelement(arr);
    }
}
