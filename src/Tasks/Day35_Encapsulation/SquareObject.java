package Tasks.Day35_Encapsulation;

public class SquareObject {

    public static void main(String[] args) {

        Square square1 = new Square(12);

        System.out.println(square1);

        square1.setSide(14);

       int a = (int) square1.getSide();

        System.out.println(square1);

        System.out.println(a);
    }
}
