public class factorial {
    static int calculateFactorial(int n){
        int fact = 1;
        if(n==0){
            return 1;
        }
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n = 5;
        int result = calculateFactorial(n);
        System.out.println("The factorial is: "+result);
    }
}
