public class quickSort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low ; j< high-1; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }

    static void quicksort(int arr[], int low, int high){
        if(low < high){
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot+1, high);
        }
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 15, 10, 18, 16};
        quicksort(arr, 0, arr.length -1);
        print(arr);
    }
}
