package Tasks.Day39_Encapsulation_Inheritance.animalTask;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String size, String color, char gender, int age) {
        super(name, "Dolphin", size, color, gender, age);
    }

    public void eat(){
        System.out.println(getBreed()+" "+getName()+" is eating");
    }

    public void swim(){
        System.out.println(getName()+" is swimming");
    }
}
