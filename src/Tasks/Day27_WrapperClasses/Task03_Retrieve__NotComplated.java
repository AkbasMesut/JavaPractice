package Tasks.Day27_WrapperClasses;

public class Task03_Retrieve__NotComplated {


    public static void main(String[] args) {

        String str1 = "123asd#$½";

        String str2 = new String();

        str2 = str1;




    }







    public static String retrieve(String str){

        String letter   ="",
                digit   ="",
                special ="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

           if (Character.isLetter(ch)){
               letter += ch;
           }else if (Character.isDigit(ch)){
               digit += ch;
           }else {
               special += ch;
           }

        }

        String result = letter+digit+special;

        return result;
    }




}
