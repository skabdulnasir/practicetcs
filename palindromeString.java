import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String reverseStr="";
        for(int i =str.length()-1; i>=0; i--){
            reverseStr += str.charAt(i);
        }

        if(str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }   
}
