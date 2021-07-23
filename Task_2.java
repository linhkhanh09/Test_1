package fs.apidef.identifyservice.java.Test;

import java.util.*;

/**
 * There is a Cat class with a String variable name, int variable age.
 *
 * Create a Map<Integer, Cat> and add 10 cats represented by (index, Cat) pairs.
 *
 * Get a Set of all cats from the Map and display it on the screen.
 *
 * Requirements
 * •The program must not read data from the keyboard.
 * •The createMap method must create a new HashMap<Integer, Cat> object.
 * •The createMap method must add 10 cats to the map, represented by (index, Cat) pairs.
 * •The createMap method must return the created map.
 * •The convertMapToSet method must create and return the set of cats retrieved from the passed map.
 * •The program must display name and age each cats in the set.
 */

public class Task_2 {
    public static void main(String[] args) {
        Map<Integer, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCats(set);
    }

    public static Map<Integer,Cat> createMap() {
        HashMap<Integer, Cat> hashMap = new HashMap<>();

        hashMap.put(0, new Cat("A", 1));
        hashMap.put(1, new Cat("B", 2));
        hashMap.put(2, new Cat("C", 3));
        hashMap.put(3, new Cat("D", 2));
        hashMap.put(4, new Cat("E", 1));
        hashMap.put(5, new Cat("F", 5));
        hashMap.put(6, new Cat("G", 4));
        hashMap.put(7, new Cat("H", 2));
        hashMap.put(8, new Cat("I", 1));
        hashMap.put(9, new Cat("K", 3));

        return hashMap;
    }

    public static Set<Cat> convertMapToSet(Map<Integer, Cat> map){
        Set<Cat> set = new HashSet<Cat>(map.values());
       return set;
    }

    public static void printCats(Set<Cat> cats) {
        cats.forEach(cat -> System.out.println("cat name: " + cat.name + " and cat age: " + cat.age));
    }

    public static class Cat{
        private String name;
        private Integer age;

        public Cat(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
}