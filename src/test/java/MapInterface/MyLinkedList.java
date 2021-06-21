package MapInterface;
import java.util.LinkedList;

public class MyLinkedList<S> {

    // Java program to demonstrate the
// working of a LinkedList

        public static void main(String args[])
        {
            // Creating an object of the
            // class linked list
            LinkedList<String> object = new LinkedList<String>();

            // Adding the elements to the
            // linked list
            object.add("A");
            object.add("B");
            // we can remove object or int
            object.remove(object);

            object.addLast("C");

            System.out.println(object);

            // Removing elements from the
            // list
            object.remove("B");
            object.removeFirst();

            System.out.println("Linked list after "
                    + "deletion: " + object);
        }
    }

