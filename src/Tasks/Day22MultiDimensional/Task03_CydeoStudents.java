package Tasks.Day22MultiDimensional;

public class Task03_CydeoStudents {
    public static void main(String[] args) {

        String[] bch25Grp1 = {"Jilil", "Ayhan", "Irene", "Yulia", "Muhtar"};
        String[] bch25Grp2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] bch25Grp3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String[][] bch25Grps = {bch25Grp1,bch25Grp2,bch25Grp3};

        String[] bch24Grp1 = {"Fuat", "Kenan", "Aliya", "Anna", "Murodil"};
        String[] bch24Grp2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] bch24Grp3 = {"Chris", "Yurii", "Mübarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String [][] bch24Grps = {bch24Grp1,bch24Grp2,bch24Grp3};

        String [][][] CydeoStdnts={bch24Grps,bch25Grps};

        for (String[][] cydeoStdnt : CydeoStdnts) {
            for (String[] strings : cydeoStdnt) {
                for (String s : strings) {
                    System.out.print(s+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }




    }
}
