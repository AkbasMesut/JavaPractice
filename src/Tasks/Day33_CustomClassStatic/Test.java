package Tasks.Day33_CustomClassStatic;

public class Test {

    public static void main(String[] args) {

        System.out.println("---------CydeoStudent-------");

        CydeoStudent student1 = new CydeoStudent("Mahmut",23,'M',"12",80,33,12);

        student1.printProgLanguage();
        student1.printSchoolName();

        System.out.println(student1);

        System.out.println("---------Circle-------");

        Circle circle1 = new Circle(10.2);

        System.out.println("Area :" + circle1.calcArea());
        System.out.println("Perimeter :" + circle1.calcPerimeter());
        System.out.println(circle1);

        System.out.println("---------Person-------");

        Person person1 = new Person("Ali",12,'M');

        System.out.println(person1);

        person1.eat("egg");

        System.out.println(Person.numberOfEyes);
        System.out.println(Person.numberOfHead);

        System.out.println("---------IPhone------");


        IPhone phone1 = new IPhone("IPhone 11",1200,"Yellow","Max");

        System.out.println(phone1);

        phone1.call(1354);
        phone1.faceTime("makbas@gmail.com");

        System.out.println("---------Address------");


        Address myAddress = new Address("Hasan Polatkan cd.","Eskişehir","İç Anadolu",26100);

        myAddress.setInfo();

        System.out.println(myAddress);

        System.out.println("---------Cars------");


        Car car1 = new Car("Toyota","Auris","Grey",2009,1200);

        System.out.println(car1);

        car1.drive();




    }
}
