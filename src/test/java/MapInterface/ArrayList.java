package MapInterface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ArrList<S> {
    public static void main(String[] args) {// create an array
        String[] array = {"a", "s", "f"};

        //Declaring an ArrayList
        ArrayList<String> arrayL = new ArrayList<String>();

// create arrayList out of Array
        List<String> fromartolist = Arrays.asList(array);

        // Appending the new element at the end of the Arraylist
        arrayL.add("A");
        arrayL.add("Av");
        arrayL.add("Ava");
        arrayL.add("Avaf");
        arrayL.add("Avafg");
        arrayL.add("Avavggff");
        arrayL.indexOf(2);
        //arrayL.insert();
        System.out.println(arrayL);
        Collections.addAll(arrayL, "K");
        System.out.println(arrayL);

//contains
        List collection = new ArrayList();
        collection.contains(5);

        //check if element exists in arrayList
        List checkContainsList = Arrays.asList(2, 3, 5, 56);
        if (checkContainsList.contains(3) // Element found inside Arraylist

        ) {
            System.out.println("Element found inside Arraylist");
        }

        //iterate thru thru arrayList
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            //enhanced for loop
            //for (String temparray: arrayL){

            // Printing the ArrayList
            //System.out.println(temparray);


        }

        arrayL.isEmpty();
        //remove by position
        arrayL.remove(01);
        //remove by value
        arrayL.remove("item1");
        //arrayL.removeAll();

        // Removing an element from the ArrayList
        arrayL.remove(2);


    }


}




