package fs.apidef.identifyservice.java.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 Create a set of numbers (Set<Integer>) and add 10 different numbers to it.
 Remove from the set all numbers greater than 10 .
 Requirements:
 •Create createSet() method to create and return a HashSet containing 10 different numbers.
 •Create removeAllNumbersGreaterThan10() method to remove from the set all numbers greater than 10.
 •Write unit test for the removeAllNumbersGreaterThan10() method
 */


public class Task_5 {

    public static Set<Integer> createSet() {
        //write your code here
        Set<Integer> set = new HashSet<Integer>();
        for (int i=0; i< 10; i++){
            Integer random = new Random().nextInt(16);
            set.add(random);
        }
        System.out.println("Set: " + set);
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(value -> value > 10);

        System.out.println("Removed set: " + set);
        return set;
    }

    public static void main(String[] args) {
        removeAllNumbersGreaterThan10(createSet());
    }
}