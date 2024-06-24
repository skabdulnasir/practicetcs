public class FibonacciRecursion {
    static int n0 = 0, n1 = 1;
    static void printFibonacci(int n){
        if(n > 0){
            int n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            System.out.print(" "+n2);
            printFibonacci(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.print(n0 +" "+n1);
        printFibonacci(n-2);
    }
}
