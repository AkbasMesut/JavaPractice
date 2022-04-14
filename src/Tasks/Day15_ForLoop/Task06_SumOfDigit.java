package Tasks.Day15_ForLoop;

public class Task06_SumOfDigit {

    public static void main(String[] args) {

           String str = "uEL%6& 12345 yeön";
           int sumOfDigits =0;

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if (ch>='0' && ch <='9'){
                System.out.println(ch);
                sumOfDigits += ch-48;
            }
        }
        System.out.println("sumOfDigits = " + sumOfDigits);


    }
}

/*
            Write a program that can return the sum of digits from a  string
                 Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...
 */