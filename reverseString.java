import java.util.Scanner;

public class reverseString {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the string: ");
    //     String str = sc.nextLine();
    //     String reverseStr = "";
    //     for(int i = str.length()-1; i>=0; i--){
    //         reverseStr+= str.charAt(i);
    //     }
    //     System.out.println("The reverse string is: " +reverseStr);
    // }

    //2nd way
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the string: ");
    //     String str = sc.nextLine();

    //     StringBuilder sb = new StringBuilder(str);
    //     String reversed = sb.reverse().toString();
    //     System.out.println("Reversed string "+reversed);
    // }

    //3rd way

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        int left =0; 
        int right = charArray.length - 1;
        while (left <= right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        String reversed = new String(charArray);
        System.out.println("Reversed String is : "+reversed);
    }
}


