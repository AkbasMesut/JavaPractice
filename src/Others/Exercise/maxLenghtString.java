package Others.Exercise;

public class maxLenghtString {

    public static void main(String[] args) {

        String[] words = {"aaadfsdfa","bbbbbb","whatsuppppp","jjaaaavvvaaaaaa"};

        int maxIndex = 0;
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > words[maxIndex].length()){

                maxIndex =i;
            }
        }

        System.out.println(words[maxIndex]);


    }

}
