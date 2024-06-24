import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        boolean isPrime = true;
        if(x == 0 || x==1){
            isPrime = false;
            System.out.println("Its not a prime no");
        } else {
            for(int i=2; i<= Math.sqrt(x); i++){ // sqrt of 36 is 6 the factor last is (6,6) now repeating constantly
                if(x % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Its a prime no");
        } else {
            System.out.println("Not a prime no");
        }
    }
}
