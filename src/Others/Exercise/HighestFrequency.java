package Others.Exercise;

public class HighestFrequency {

    public static void main(String[] args) {

        String str    = "aanansjkkdjdljasadssqd";


            int highFreq =0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count =0;
            for (int j = 0; j < str.length(); j++) {
                char eachChar = str.charAt(j);

                if (ch==eachChar){
                    count++;
                }
            }

            if (count>highFreq){
                highFreq=count;
            }

        }

        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)){
                    count++;
                }
            }

            if(count==highFreq && !result.contains(ch+"")){
                result  = ch+" ";
            }

        }


        System.out.println( result);


    }
}

/*
Write a program that can find the character that has the highest frequency from a string
 */