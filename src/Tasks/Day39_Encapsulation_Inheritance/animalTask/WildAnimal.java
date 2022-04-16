package Tasks.Day39_Encapsulation_Inheritance.animalTask;

public class WildAnimal extends Animal{

    private final static boolean isWild = true;
    private final static boolean isFriendly = false;
    private final static boolean isPlayable = false;

    public WildAnimal(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age,isWild,isFriendly,isPlayable);
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
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
