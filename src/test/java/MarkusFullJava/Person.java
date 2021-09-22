package MarkusFullJava;

import javax.lang.model.element.Name;

public class Person {
        private Name personName;
        private static int personCounter;

        public Person(Name personName){
            this.personName = personName;
        }

        public String shouldReturnhelloWorld() {
            return "Hello World ";
        }

        public Person(){
            //on the left side is the new value and on the right side- prior calculat var plus 1
            personCounter = personCounter+1;
            //or
            //if we dont make personcounter static- we start at 0 and then add 1 each time
            //this constructor is  is part of incstance and each obj has its own construct or and method
            //we need a class level counter, not on instance level- add static to instance var
            personCounter++;

        }

        public String helloWorld() {
            return "Hello World";
        }

        public String hello(String name) {
            return "Hello " + name;
        }

        /*we can use deful constructor to have each new person created to be added to the
         * number of persons count*/
        public static int numberOfPersons() {
            return personCounter;
        }
    }


