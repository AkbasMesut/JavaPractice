package Tasks.Day15_ForLoop;

public class Task08_PalinDrome {

    public static void main(String[] args) {

        String str = "Level";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        boolean isPalinDrome = str.equalsIgnoreCase(reversed);
        System.out.println("reversed = " + reversed);
        System.out.println("isPalinDrome = " + isPalinDrome);
    }

}
/*
Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true

 */