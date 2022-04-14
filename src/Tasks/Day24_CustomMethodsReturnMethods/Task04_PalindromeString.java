package Tasks.Day24_CustomMethodsReturnMethods;

public class Task04_PalindromeString {

    public static void main(String[] args) {


        System.out.println(isPalinDrome("ann"));


    }

    public static boolean isPalinDrome(String str){

        return Task03_ReverseString.reverse(str).equalsIgnoreCase(str);

    }
}
