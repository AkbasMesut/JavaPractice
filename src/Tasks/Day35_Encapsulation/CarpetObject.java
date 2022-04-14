package Tasks.Day35_Encapsulation;

public class CarpetObject {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(4,5,3.5,false);

        System.out.println(carpet);

        carpet.setPersian(true);
        carpet.setUnitPrice(8);
        carpet.setLength(7);
        carpet.setWidth(6);

        System.out.println(carpet);

        System.out.println(carpet.calcCost());


    }
}
