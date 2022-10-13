package Others.Exercises;

public class PrintShortestWord1 {

    public static void main(String[] args) {

        String[] str = {"java", "cable", "red", "vivid", "rem", "grace"};

        int minIndex = 0;

        for (int i = 0; i < str.length; i++) {

            if (str[i].length() < str[minIndex].length()){
                minIndex =i;
            }
        }
        System.out.println(str[minIndex]);

    }

}
