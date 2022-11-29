package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        // create a `counter`
        int i=0;
        // while `counter` is less than length of array
        while(i< personArray.length) {// begin loop
            Person person = personArray[i];// use `counter` to identify the `current Person` in the array
            String rep = person.toString();// get `string Representation` of `currentPerson`
            result = result + rep;// append `stringRepresentation` to `result` variable
            i++;
        } // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
//        "i=0"// identify initial value
//        "i< personArray.length"// identify terminal condition
//        "i++"// identify increment

        for (int i = 0; i < personArray.length; i++) {// use the above clauses to declare for-loop signature
            // begin loop
            Person person = personArray[i];// use `counter` to identify the `current Person` in the array
            String rep = person.toString();// get `string Representation` of `currentPerson`
            result = result + rep;// append `stringRepresentation` to `result` variable
        } // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        // use the above discoveries to declare for-each-loop signature
        for (Person person:personArray) // begin loop
            {
            String rep = person.toString();// get `string Representation` of `currentPerson`
            result = result + rep;// append `stringRepresentation` to `result` variable
        }  // end loop
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
