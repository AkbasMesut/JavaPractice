package Tasks.Day39_Encapsulation_Inheritance;

public class Animal {

    private String name, breed, size, color;
    private char gender;
    private int age;

    public Animal(String name, String breed, String size, String color, char gender, int age) {
        setName(name);
        setBreed(breed);
        setSize(size);
        setColor(color);
        setGender(gender);
        setAge(age);
    }

    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }
    public char getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name==null||name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name : " + name);
            System.exit(1);
        }
        this.name = name;
    }
    public void setBreed(String breed) {
        if (breed==null||breed.isBlank()||breed.isEmpty()){
            System.err.println("Invalid breed : " + breed);
            System.exit(1);
        }
        this.breed = breed;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setColor(String color) {
        if (color==null||color.isEmpty()|color.isBlank()){
            System.err.println("Invalid breed : " + color);
            System.exit(1);
        }
        this.color = color;
    }
    public void setGender(char gender) {
        if (!(gender=='M'||gender=='F')){
            System.err.println("Invalid gender : " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }
    public void setAge(int age) {
        if (age<0){
            System.err.println("Invalid age : "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void move(){
        System.out.println(name+" is moving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
