package Tasks.Day23_CustomMethodsVoidParameters;

import java.util.Arrays;

public class Task15_Anagram {

    public static void main(String[] args) {

        anagram("anna","nana");


    }

    public static void anagram(String str1,String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String result ="";
        if (Arrays.equals(ch1,ch2)){
            result = " are anagram";
        }else {
            result = " are not anagram.";
        }

        System.out.println(str1+" and "+str2+result);



    }
}
