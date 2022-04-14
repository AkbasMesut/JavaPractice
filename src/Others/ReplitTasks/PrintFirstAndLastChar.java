package Others.ReplitTasks;

public class PrintFirstAndLastChar {

    public static void main(String[] args) {

       String[] words = {"muhtar","mesut","ahmet","memet"};


        for (String word : words) {

            System.out.print(word.charAt(0)+""+word.charAt(word.length()-1));
        }
        System.out.println();


    }
}
