package MapInterface;// Java program to demonstrate working of HashSet
import org.junit.Test;

import java.util.*;

class HashSetDemo {

    // Main Method
    public static void main(String[] args)
    {
        Collection<String> c = new HashSet<String>();
        Set<String> h = new HashSet<String>();
        HashSet <String> h1 = new HashSet<String>();
        Object o = new Object();

        // Adding elements into HashSet usind add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India"); // adding duplicate elements
        h1.add("Cupertino");
        h.contains(2);
       // h.retainAll();


        if(h.contains("India")){
            System.out.println("Hashset contains element 2");
        }

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:"
                + h.contains("India"));

        // Removing items from HashSet using remove()
        h.remove("Australia");
        System.out.println("List after removing Australia:"
                + h);

        // Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        // Instantiate an object
        // of HashSet
        HashSet<String> hs = new HashSet<String>();

        // Elements are added using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");

        // Print the contents on the console
        System.out.println("Initial HashSet " + hs);

        // Removing the element B
        hs.remove("B");

        // Print the contents on the console
        System.out.println("After removing element " + hs);

        // Returns false if the element is not present
        System.out.println("Element AC exists in the Set : "
                + hs.remove("AC"));

        // Instantiate an object of HashSet
        HashSet<String> hs1 = new HashSet<String>();

        // Elements are added using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");

        // Iterating though the HashSet
        Iterator itr = hs.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + ", ");
        System.out.println();

        // Using enhanced for loop
        for (String s : hs)
            System.out.print(s + ", ");
        System.out.println();}}



    // Constructor - 1
// All the constructors are internally creating HashMap Object.




