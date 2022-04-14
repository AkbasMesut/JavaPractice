package Tasks.Day23_CustomMethodsVoidParameters;

public class Task02_PrintEvenNumber {

    public static void main(String[] args) {

        printEvenNumber();

    }

    public static void printEvenNumber(){

        for (int i = 0; i < 101; i +=2) {
            System.out.print(i+" ");
        }
    }

}
