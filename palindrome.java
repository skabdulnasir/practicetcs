import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int x = sc.nextInt();
        int res = 0;
        int temp = x;
        while(x >0){
            int rem = x % 10;
            res = res * 10 + rem;
            x= x/10;
        }

        if(temp == res){
            System.out.println("Its a plaindrome number");
        } else {
            System.out.println("Not a palindorme");
        }
    }
}
