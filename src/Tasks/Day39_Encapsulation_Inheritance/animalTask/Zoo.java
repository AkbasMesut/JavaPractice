package Tasks.Day39_Encapsulation_Inheritance.animalTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Rager","Bulldog","Small","Yellow",'F',2);
        Dog dog2 = new Dog("Max","Rod wilder","Large","Black",'M',1);
        Cat cat1 = new Cat("Mırmır","British","Small","White",'F',2);
        Cat cat2 = new Cat("Minnoş","Van","Large","Black",'M',1);
        Dolphin dolphin1 = new Dolphin("Big Smile","Large","White",'M',2);

        Lion lion1 = new Lion("Breave","Africa","Large","Yellow",'M',2);
        Lion lion2 = new Lion("Cimmy","Afganistan","Small","Yellow",'F',1);
        Tiger tiger1 = new Tiger("Billy","Belgal","Medium","Black",'M',3);
        Tiger tiger2 = new Tiger("John","China","Medium","White",'M',1);
        Eagle eagle1 = new Eagle("Kartal","American","Large","Black",'M',2);


       ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(dog1,dog2,cat1,cat2,dolphin1,lion1,lion2,tiger1,tiger2,eagle1));

       ArrayList<FriendlyAnimal> friendlies = new ArrayList<>();
       ArrayList<WildAnimal> wilds = new ArrayList<>();

        for (Animal animal : animals) {

            if (animal.isWild()){
                wilds.add((WildAnimal) animal);
            }else {
                friendlies.add((FriendlyAnimal) animal);
            }
        }
        System.out.println(wilds);

    }
}
