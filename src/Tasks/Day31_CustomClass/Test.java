package Tasks.Day31_CustomClass;

public class Test {

    public static void main(String[] args) {

        System.out.println("------salary------");

        SalaryCalculator obj1 = new SalaryCalculator(60,5.2,2.2,26);

        System.out.println(obj1);

        System.out.println("------address------");

        Address obj2 = new Address("2356A","Hasan Polatkan cd.","Eskişehir","İç Anadolu",26100);

        System.out.println(obj2);

        System.out.println("------Item------");

        Item item1 = new Item("drone",5000,3);

        System.out.println(item1);



    }
}
