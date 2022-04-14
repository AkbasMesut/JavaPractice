package Tasks.Day24_CustomMethodsReturnMethods;

public class Task02_Anagram {

    public static void main(String[] args) {


        System.out.println(isAnagram("bcd","dca"));


    }

    public static boolean isAnagram (String str1,String str2){
         boolean isAnagrams = true;

             int count =0;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            for (int j = 0; j < str2.length(); j++) {
                char each = str2.charAt(j);

                if (ch==each){
                    count++;
                }

            }

            isAnagrams = count==str1.length();

        }

        return isAnagrams;


    }



}
