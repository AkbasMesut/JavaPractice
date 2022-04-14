package Tasks.Day33_CustomClassStatic;

public class IPhone {

    public String model;
    public double price;
    public String color;
    public String size;

    public static String brand;
    public static String OS;
    public static String madeIn;

    public IPhone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }
    static {
        brand = "Apple";
        OS = "IOS 11";
        madeIn = "China";
    }


    public void faceTime(long phoneNumber){
        System.out.println(model+" is face timing with"+ phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model+" is emailing to "+ email);
    }

    public void call(long phoneNumber){
        System.out.println(model+ " is calling " +phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model+" is texting " + phoneNumber);
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }




}

/*
       Creat  a class named IPhone:
				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */
