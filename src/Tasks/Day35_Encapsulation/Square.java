package Tasks.Day35_Encapsulation;

public class Square {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            return;
        }
        this.side = side;
    }


    public void calcArea(){
        System.out.println("Area of square is " + side*side);
    }

    public void calcPerimeter(){
        System.out.println("Perimeter of square is " + side*4);
    }


    public String toString() {
        return "Square{" +
                "side = " + side +
                ", area = " + side*side +
                ", perimeter = " + side*4 +
                '}';
    }
}
/*
              Create a class named Square:
				Private variables:
					side

				Encapsulate all the fields

					Condition:
						side of the square should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of square
					calcPerimeter(): returns the perimeter of square
					toString(): can display the side, area, perimeter of square when object is passed in print statement
 */
