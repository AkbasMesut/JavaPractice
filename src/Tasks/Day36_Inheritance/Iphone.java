package Tasks.Day36_Inheritance;

public class Iphone extends phone {

    public Iphone( String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public void faceTime(long phoneNumber) {
        System.out.println(model + " is face timing with number " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println(model + " is face timing with email " + email);
    }

}
