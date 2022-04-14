package Tasks.Day20_Arrays;

public class Task01_Classmates {

    public static void main(String[] args) {

        String[] names = {"Mike Tyson","Joe Biden","Muhammed Ali","Kevin Durand","Stephen Cory","Elif Şafak","Mahmud Tuncer","Mehmet Ali","Boris Jansın"};

        for (String name : names) {
            System.out.println(name.charAt(0)+"."+name.charAt( name.indexOf(" ")+1 ));
        }



    }
}
