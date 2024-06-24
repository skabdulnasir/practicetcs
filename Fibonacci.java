import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number limit: ");
        int n = sc.nextInt();
        int x = 0, y= 1;
        System.out.print(x +" "+ y);
        int i =2;
        while (i<n) {
            int z = x+y;
            System.out.print(" "+z);
            x = y;
            y = z;

            i++;
        }
    }
}
