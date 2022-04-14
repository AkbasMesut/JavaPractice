package Tasks.Day27_WrapperClasses;

public class Task04_Retrieve_NotComplated {


    public static void main(String[] args) {


        String str = "Wooden Spoon12!";



        String letter   ="",
                digit   ="",
                special ="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch>='A'&& ch<='Z'){
                letter += ch;
            }else if (ch>='a'&& ch<='z'){
                letter += ch;
            }else if (ch>='0'&& ch<='9'){
                digit += ch;
            }else {
                special +=ch;
            }
        }

        System.out.println("letters= "+letter);
        System.out.println("Digits= "+digit);
        System.out.println("specialChars= "+special);

    }
}
