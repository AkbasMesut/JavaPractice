package Tasks.Day39_Encapsulation_Inheritance.animalTask;

public class Dog extends FriendlyAnimal{

    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void eat(){
        System.out.println(getBreed()+" "+getName()+" is eating");
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }

}
