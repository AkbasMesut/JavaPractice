package Tasks.Day35_Encapsulation;

public class PizzaObject {

    public static void main(String[] args) {

        Pizza pizza = new Pizza("MEDİUM",1,2);

        System.out.println(pizza);

        pizza.setSize("Large");

        System.out.println(pizza.calcCost());

        System.out.println(pizza);

    }
}
