package MapInterface;
import java.util.ArrayList;
import java.util.*;

public class HashMapJan {
    public static void main(String []args){
    Map<String, Integer> map = new HashMap<>();
    HashMap<String, String> map1 = new HashMap<>();

    map.put("one", 2);
    map1.put("one", "A");
    map1.put("two", "B");
    map1.put("three", "C");
    map1.containsKey(2);
    map1.get(2);
    map1.containsValue("A");
    System.out.println("Get element two : " + map1);
    map1.size();
    System.out.println("Maps size " + map1.size());
  //?  map1.getOrDefault();
        map1.putIfAbsent("Four","L");
        //map1.addAll();

//display soreted keys and their values
       // for (String key1 :  map) System.out.println(key1 + " :" + map1.get(key1));


    System.out.println("Is map empty? : " + map1.isEmpty());

        //check iteration of Hashmap elements
        for(String keyHash : map1.keySet()){
            System.out.println("Key: "+ keyHash + " value : " + map1.get(keyHash));

        }

        if (map1.containsKey(2)){
            System.out.println("Key two is present");
        }

    //convert HMap to AList- KEYS
        List<String> arListH = new ArrayList<String>(map.keySet());
        System.out.println("Size of key set from map " + map.size());

        //convert HMap to AList- VALUES
        //List<String >arListH1 = new ArrayList<String>(map.values());
     //   ?//System.out.println("Size of Value list from map" + map1.set(1, "A"));


        map.put("Al", 5);
        System.out.println(map);

                // Create an empty hash map
                HashMap<String, Integer> map2 = new HashMap<String,Integer>();



                // Add elements to the map
                map.put("vishal", 20);
                map.put("sachin", 30);
                map.put("vaibhav", 20);

                // Print size and content
                System.out.println("Size of map is:- "
                        + map.size());
                System.out.println(map);

                // Check if a key is present and if
                // present, print value
                if (map.containsKey("vishal")) {
                  //  Integer a = map.get("vishal");
                    System.out.println("value for key");
                     //       + " \"vishal\" is:- " + a);

            }

    }}


