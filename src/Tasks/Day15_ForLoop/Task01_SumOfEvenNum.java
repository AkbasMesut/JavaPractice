package Tasks.Day15_ForLoop;

public class Task01_SumOfEvenNum {

        public static void main(String[] args) {

        int num = 0;

            for (int i = 0; i < 101; i +=2) {
                num +=i;
            }

            System.out.println("num = " + num);

    }
}
/*
  Write a program that can return the sum of even numbers between 1 to 100

 */