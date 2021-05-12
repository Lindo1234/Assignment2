package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTest {

    @Test
    void collection() {
        Map mapping = new HashMap();
        mapping.put("Dog", "3");
        mapping.put("Python", "20");
        mapping.put("Cat", "7");
        mapping.put("Elephant", "14");

        mapping.remove("Dog");
      //  System.out.println("Animals remaining \n" + mapping + "\n");
        assertEquals("[Cat, Elephant, Python]", mapping.keySet().toString());

        //Find if the Collection contains 200

        assertTrue(mapping.containsValue("20"));
    }

    @Test
    void list() {


        LinkedList<String> animals = new LinkedList<>();
        // Adding elements to the list
        animals.add("Snake");
        animals.add("Butterfly");
        animals.add("Frog");
        animals.add("Cow");
        assertEquals("[Snake, Butterfly, Frog, Cow]", animals.toString());

        //Removing Snake from the list
        animals.remove("Snake");
     //   System.out.println("Animals remaining \n" + animals + "\n");
        assertEquals("[Butterfly, Frog, Cow]", animals.toString());

        //Find if the list contains an element Cow
        assertTrue(animals.contains("Cow"));
    }



    @Test
    void set() {

        //Add
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        assertEquals("[5, 10, 15]", numbers.toString());


        //Remove
        numbers.remove(15);
        //  System.out.println("Numbers remaining \n" + numbers + "\n");
        assertEquals("[5, 10]", numbers.toString());

        //Find if the set contains 5

        assertTrue(numbers.contains(5));



    }

    @Test
    void map() {
        TreeMap<Integer, String> map = new TreeMap();
        map.put(100, "Dog");
        map.put(200, "Snake");
        map.put(300, "Cat");

        assertEquals("[100, 200, 300]", map.keySet().toString());

        //Remove element

        map.remove(100, "Dog");
       // System.out.println("Map remaining \n" + map + "\n");
        assertEquals("[200, 300]", map.keySet().toString());

        //Find if the map contains 200

        assertTrue(map.containsValue("Snake"));

    }
}