package Others.ReplitTasks;

public class CountTriple {

    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
        String str = "djkfnxxxkDC";
        int count = 0;

        char ch1 = ' ';
        char ch2 = ' ';
        char ch3 = ' ';

        for (int i = 0; i < str.length(); i++) {

            if (i + 2 < str.length()) {

                ch1 = str.charAt(i);
                ch2 = str.charAt(i + 1);
                ch3 = str.charAt(i + 2);

                if (ch1 == ch2 && ch1 == ch3) {
                    count++;
                }

            }

        }

        System.out.println(count);
    }
}
