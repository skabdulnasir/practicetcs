public class factorialRecursion {
    static int calfactorialRecursion(int num){
        if(num == 0){
            return 1;
        } else {
            return (num * calfactorialRecursion(num - 1));
        }
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("The resultant factorial is: "+calfactorialRecursion(num));
    }
}
