/** Applications Development Practice III (ADP372S)
 * Assignment 2
 * Author: Lindokuhle Xaki 215041720
 * Due Date: Sunday, 16th May 2021
**/


package za.ac.cput;

import java.util.*;

public class Collection {

    //Collection

    public void collection(){

        Map mapping = new HashMap();
        mapping.put("Dog", "3");
        mapping.put("Python", "20");
        mapping.put("Cat", "7");
        mapping.put("Elephant", "14");

        System.out.println("\nMap elements/values\n====================");
        System.out.println(mapping);



    }

    //List

    public void List(){

        LinkedList<String> animals = new LinkedList<>();
        // Adding elements to the list
        animals.add("Snake");
        animals.add("Butterfly");
        animals.add("Frog");
        animals.add("Cow");

        Iterator<String> iterator = animals.iterator();

        // Displaying values of the list
        System.out.println("\nList of animals\n=========================");

        //Removing an element
        animals.remove("Frog");
        System.out.println("List of animals" + animals + "\n");

        }

    //Set

    public void Set() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);


        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("\nSet of numbers\n");
        numbers.remove(5);
        System.out.println("New set of numbers " + numbers);



        //Map
    }
        public void Map(){

            TreeMap<Integer, String> map = new TreeMap();
            map.put(100, "Dog");
            map.put(200, "Snake");
            map.put(300, "Cat");


            System.out.println("Initial list of elements:");
            for (Map.Entry m : map.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
            System.out.println("Updated list of elements:");
            map.remove(200, "Snake");
            for (Map.Entry m : map.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }

        }
    }








