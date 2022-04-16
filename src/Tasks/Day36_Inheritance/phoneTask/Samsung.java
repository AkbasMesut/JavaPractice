package Tasks.Day36_Inheritance.phoneTask;

import Tasks.Day36_Inheritance.phoneTask.phone;

public class Samsung extends phone {



    public Samsung( String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }

    public void freeze(){
        System.out.println(model+" is freezing");
    }
}
