package Others.Exercises;

import java.util.Arrays;

public class a {

    public static void main(String[] args) {


int[] population = {10,20,30,40,50};

        System.out.println("average(population) = " + average(population));


    }


    public static double average(int[] population){

        int average=0;
        for (long each : population) {

            average += each/population.length;
        }
        return average;
    }


}
