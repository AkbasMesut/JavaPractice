package Tasks.Day39_Encapsulation_Inheritance.animalTask;

public class Tiger extends WildAnimal{

    public Tiger(String name, String breed,String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void hunt(){
        System.out.println(getBreed()+" "+getName()+" is hunting");
    }

}
