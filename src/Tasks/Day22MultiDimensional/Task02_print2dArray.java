package Tasks.Day22MultiDimensional;

public class Task02_print2dArray {

    public static void main(String[] args) {

        String[][] items = {{"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        System.out.println("----first print----");
        for (String[] item : items) {
            for (String s : item) {
                System.out.print(s+"\t");
            }
            System.out.println();
        }

        System.out.println("\n----second print----");

        for (String[] item : items) {
            String str ="";
            for (int i =item.length-1; i >=0 ; i--) {
                str = item[i]  ;
                System.out.print(str+"\t");
            }
            System.out.println();
        }

        System.out.println("\n----third print----");


        for (int i = items.length - 1; i >= 0; i--) {

            for (int j = 0; j < items[i].length; j++) {

                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }


    }

}
