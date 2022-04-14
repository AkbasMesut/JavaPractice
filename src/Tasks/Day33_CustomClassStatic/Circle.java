package Tasks.Day33_CustomClassStatic;

public class Circle {

    public double radius;
    public static double pi;

    public Circle(double radius) {
        this.radius = radius;
    }

    static {
    pi = 3.14;
    }

    public double calcArea(){

        return radius*radius*pi;
    }

    public double calcPerimeter(){
        return pi*radius*2;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + radius*2 +
                '}';
    }

}
/*
      Circle Task:
		1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement

 */