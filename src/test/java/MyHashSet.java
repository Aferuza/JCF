import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;


public class MyHashSet {

    public static void main(String [] args){
    Set<String> myset = new LinkedHashSet<String>();
      myset.add("1");
      myset.add("10");
       myset.add("100");myset.contains('e');
       myset.size();
       myset.isEmpty();
       myset.toArray();
      // myset.addAll();
       System.out.println(myset);
  }

//    Set<String> mysetL = new LinkedHashSet<String>();
//        mysetL.add("L1");
//        mysetL.add("L10");
//
//        System.out.println(mysetL.contains("L1"));
}

