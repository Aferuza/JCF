import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class myCollection {


    public static void main(String[] args)  {

        Collection<String> myCollec = new ArrayList<String>();
        Collection<String>workdays = new ArrayList<String>();

        workdays.add("j");
        workdays.add("k");
        workdays.add("d");
        workdays.add("u");


        myCollec.add("SkyLine");
        myCollec.add("Se");
        myCollec.add("Line");
        myCollec.add("Sk");
        //System.out.println(myCollec.addAll(workdays));;
       // myCollec.isEmpty();
       myCollec.removeAll(workdays);
       System.out.println(myCollec.removeAll(myCollec));//true

       // System.out.println(workdays.size());
        //Assert.assertEquals("empty", 0);
        //Assert.assertEquals(0,workdays.size());
       // myCollec.size();
        //myCollec.toArray();
//        myCollec.contains(false);
//        System.out.println(myCollec);
//        Iterator i = myCollec.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());

//        for (Object i : myCollec){
//            System.out.println(myCollec.size());
//            System.out.println(i);

        }
    }

