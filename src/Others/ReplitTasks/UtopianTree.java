package Others.ReplitTasks;

public class UtopianTree {

    public static void main(String[] args) {

        int growth=0;
        int growthrate;

        for(int i=1;i<=10;i++)
        {
            if(i<4)
            {
                growthrate=1;
            }
            else
            {
                growthrate=2;
            }

            growth+=growthrate;

            System.out.println("year "+ i + " - growth " + growthrate + " cm");
            System.out.println("tree size: "+ growth + "cm");
        }

    }
}
