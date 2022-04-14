package Tasks.Day27_WrapperClasses;

public class Task05_UpperLowerEqual {


    public static void main(String[] args) {

        String str = "java JAVA";

        int  lower =0;
        int  upper =0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)){
                lower++;
            }
            if (Character.isUpperCase(ch)){
                upper++;
            }
        }

        boolean result = lower == upper;

        System.out.println("result = " + result);

    }


}



