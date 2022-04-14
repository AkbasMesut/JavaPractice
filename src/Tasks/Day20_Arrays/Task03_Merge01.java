package Tasks.Day20_Arrays;

public class Task03_Merge01 {

    public static void main(String[] args) {

        String[]  items   = {"Shoes",   "Jacket",  "Gloves",  "AirPods",     "iPad",  "iPhone 12 case"  };
        double[]  prices  = {  99.99,     150.0,       9.99,     250.0 ,     439.50,           39.99    };
        int[]     itemIDs = {  12345,     12346,      12347,      12348,      12349,           12350    };


        int indexOfGloves = -1;
        Boolean hasipad = true;


        for (int i = 0; i < items.length; i++) {
            String name  = items[i];
            double price = prices[i];
            int item = itemIDs[i];

            if (name.equals("Gloves")){
                indexOfGloves=i;
            }
            if (name.equals("ipad")){
                hasipad = true;
            }

            System.out.println(name+" : "+price+"-"+item);

        }

        System.out.println("indexOfGloves : " + indexOfGloves);
        System.out.println("hasipad : " + hasipad);





    }
}
