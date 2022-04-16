package Tasks.Day39_Encapsulation_Inheritance.animalTask;

public class Eagle extends WildAnimal{

    public Eagle(String name,String breed ,String size, String color, char gender, int age) {
        super(name,breed, size, color, gender, age);
    }

    public void eat(){
        System.out.println(getBreed()+" "+getName()+" is hunting");
    }

    public void fly(){
        System.out.println(getBreed()+" "+getName()+" is flying");
    }

}
