package MarkusFullJava;

import enumMarkus.LoggingLevel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    static final String [] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};

    @Test
    public void shouldReturnHelloWorld(){
        Person marcusObj = new Person();
        assertEquals("Hello World", marcusObj.helloWorld());

    }

    @Test
    public void shouldReturnHelloMarcus(){
        Person personNameObj = new Person();
        assertEquals("Hello Markus", personNameObj.hello("Markus"));
    }

    @Test
    public void shouldReturnNumberOfPersons(){
        Person numbePersObj = new Person();
        Person numbePersObj1 = new Person();
        Person numbePersObj2 = new Person();
        Person numbePersObj3 = new Person();
        Person myNumbePersObj = new Person();
        //assertEquals(4, numbePersObj2.numberOfPersons());
        assertEquals(5, Person.numberOfPersons());
        // we can just call Person- we are not gpoing into any specigic instance
        //calling static meth on pers class
    }
    /*
     * static method with for loop
     * see in debugger how many times constructor was called
     * */

    @Test
    public void calculNumbOfTimesCnstructorIsCallerWithLoop(){
        Person person1;
        for (int i = 0; i<10;i++){
            person1 = new Person();
        }
        assertEquals(10, Person.numberOfPersons());

    }

   /*while loop- wn count smth- at once and I have some condition that gets
   dynamicaly calculated
   * */

    @Test
    public void whileLoop(){
        Person person1;
        int i = 0;
        while (i<4){
            i++;
        }
        for (int anI =0; i<4; i++){
            person1= new Person();
        }
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void doWhile(){
        Person person1;
        int i = 0;
        do{
            person1= new Person();
            i++;
        }
        while(i<4);
        assertEquals(5, Person.numberOfPersons());
    }
    //arrays hold primitive atatype

    @Test
    public void ArraysDemo(){
        //this isnt calling constructor, its creating 4 persons in array
        //personn array object of type Person
        Person[] persons = new Person[4];
        /* Java violates rules of obj  oriented design and makes attirbutes like
         * length public insted of private*/

        //assign a new array- so now we have 2 remote controls
        //reference to an object
        Person myPerson = new Person();
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();
        persons[3] = new Person();

        //now array has 2 remote controls(references to it)
        persons[2]= myPerson;
        myPerson = persons[2];
        Person[] personA = new Person[4];
        for (int i =0; i<4; i++){

            //person at position i- eachtime we create an obj of type
            // Person and we put it
            //dynamically at position i- will fill the array with persons
            persons[i] = new Person();
            //access individ obg
            persons[i].helloWorld();

            // for each loop-
            for (Person person : persons){
                person.helloWorld();
            }
        }

        Person myPersonA = new Person();
        Person myPerson2 = null;

        //protection final
        final Person [] personArray = {persons[0],null, persons[3], myPerson2};
        //create reference to 6 th element in person Array
//        Person vip = personArray[6];
//        vip.helloWorld();

        LoggingLevel state = LoggingLevel.PENDING;
        for (String state1: MY_STATE_VALUES){
            //compare 2 strings
            if(state.equals("PENDING")){
            } if(state.equals("PROCESSING")){
            } if(state.equals("PROCESSED")){
            }
        }
    }

}
