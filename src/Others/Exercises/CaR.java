package Others.Exercises;

public class CaR {

    public String brand, model;
    public int year;
    public double engine;

    public CaR(){}

    public CaR(String brand, String model, int year, double engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }


    public String toString() {
        return "CaR{" + "brand='" + brand + '\'' +", model='" + model + '\'' + ", year=" + year + ", engine=" + engine +'}';
    }






    public static void main(String[] args) {


        CaR car1 = new CaR();
        CaR car2 = new CaR("Toyota","Corolla",2021,1.6);
        CaR car3 = null;

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


        System.out.println("-----------review---------------");

        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;
        car1.engine = 1.6;

        System.out.println( "Brand of car =" + car1.brand);
        System.out.println( "Model of car =" + car1.model);
        System.out.println( "Year of car =" + car1.year);
        System.out.println( "Engine of car =" + car1.engine);


    }


}
