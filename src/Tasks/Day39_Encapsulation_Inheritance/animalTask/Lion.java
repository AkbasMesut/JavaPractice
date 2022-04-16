package Tasks.Day39_Encapsulation_Inheritance.animalTask;

public class Lion extends WildAnimal{

    public Lion( String name,String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void hunt(){
        System.out.println(getBreed() + " "+ getName()+ " is hunting");
    }
}
