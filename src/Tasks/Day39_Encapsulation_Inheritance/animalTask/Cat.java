package Tasks.Day39_Encapsulation_Inheritance.animalTask;

public class Cat extends FriendlyAnimal{

    public Cat(String name,String breed,  String size, String color, char gender, int age) {
        super(name,breed, size, color, gender, age);
    }

    public void eat(){
        System.out.println(getBreed()+" "+getName()+" is eating");
    }

    public void scratch(){
        System.out.println(getName()+" is scratching");
    }
    public void meow(){
        System.out.println(getName()+" is meowing");
    }

}
