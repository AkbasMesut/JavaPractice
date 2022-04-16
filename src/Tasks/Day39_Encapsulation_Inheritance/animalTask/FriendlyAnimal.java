package Tasks.Day39_Encapsulation_Inheritance.animalTask;

public class FriendlyAnimal extends Animal {

    private final static boolean isWild = false;
    private final static boolean isFriendly = true;
    private final static boolean isPlayable = true;

    public FriendlyAnimal(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age,isWild,isFriendly,isPlayable);

    }

    public void play(){
        System.out.println(getName()+" is playing");
    }


    public String toString() {
        return "FriendlyAnimal{" +
                "name = '" + getName() + '\'' +
                ", breed = '" + getBreed() + '\'' +
                ", size = '" + getSize() + '\'' +
                ", color = '" + getColor() + '\'' +
                ", gender =" + getGender() +
                ", age = " + getAge() +
                ", isWild = " + isWild +
                ", isFriendly= " + isFriendly +
                ", isPlayable = " + isPlayable +
                "}";
    }
}
