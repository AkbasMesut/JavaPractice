package Others.Exercise;

public class NonDuplicate {

    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        int[] score = {1, 1, 2, 1, 3, 3, 4, 2};


        for (int i = 0; i < score.length; i++) {

            int unique = 0;
            for (int j = 0; j < score.length; j++) {

                if (i != j && score[i] == score[j]) {
                    unique++; }

            }

            if (unique == 0) {
                System.out.println(score[i]);
                break;
            }

        }

    }

}
