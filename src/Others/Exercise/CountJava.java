package Others.Exercise;

public class CountJava {

    public static void main(String[] args) {

        String word = "ajfjfjavaasjdkjava";

        int countOfJava = 0;
        int lastIndex=0;

        while(lastIndex != -1)
        {
            lastIndex = word.indexOf("java",lastIndex); // ?

            if(lastIndex != -1)
            {
                countOfJava++;
                lastIndex += "java".length();  //  ?
            }
        }

        System.out.println(countOfJava);
    }
}
