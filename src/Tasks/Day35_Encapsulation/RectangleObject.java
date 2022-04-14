package Tasks.Day35_Encapsulation;

public class RectangleObject {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(-5,6);

        System.out.println(rectangle1);

        int w = rectangle1.getWidth();
        int l = rectangle1.getLength();

        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());

        System.out.println("with : " + w );
        System.out.println("length : "+ l);

    }
}
