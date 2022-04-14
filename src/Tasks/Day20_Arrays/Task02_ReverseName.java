package Tasks.Day20_Arrays;

public class Task02_ReverseName {

    public static void main(String[] args) {

        String[] names = {"Mike Tyson", "Joe Biden", "Muhammed Ali", "Kevin Durand", "Stephen Cory", "Elif Şafak", "Mahmud Tuncer", "Mehmet Ali", "Boris Jansın"};

        for (String each : names) {

            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--) {

                reversed += each.charAt(i);

            }
            System.out.println(reversed);

        }

    }
}
