package Others.ReplitTasks;

public class PrintEvenFrom80To20 {

    public static void main(String[] args) {


            String a ="";
         for (int i = 80; i >=20 ; i-=2) {
              a +=i+" ";
        }


        System.out.print(a.substring(0, a.length()-1));
    }
}
