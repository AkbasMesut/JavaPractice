package Tasks.Day24_CustomMethodsReturnMethods;

public class Task03_ReverseString {

    public static void main(String[] args) {


        System.out.println(reverse("java"));

    }

    public static String reverse (String str){

        String rvr = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            char ch = str.charAt(i);

            rvr += ch;

        }
        return rvr;
    }

}
