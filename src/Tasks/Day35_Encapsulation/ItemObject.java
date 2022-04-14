package Tasks.Day35_Encapsulation;

public class ItemObject {

    public static void main(String[] args) {

        Item item = new Item("Knife",20,5);

        System.out.println(item);

        System.out.println("item price = $" + item.calcCost());

        item.setName("dan<");

        System.out.println(item.getName());
    }
}
