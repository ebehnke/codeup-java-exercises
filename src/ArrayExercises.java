import java.util.Arrays;

public class ArrayExercises {

    static Person[] addPerson(Person[] oldPeople, Person newPerson) {
        // declare new array for newPerson to go in
        Person[] newPeople;
//        newPeople = new Person[oldPeople.length + 1];
        // create a copy of oldPeople array and add one 1
        newPeople = Arrays.copyOf(oldPeople, oldPeople.length + 1);
        // assign the newPerson as the new array's last item
        newPeople[newPeople.length - 1] =  newPerson;
        return newPeople;
    }

    public static void main(String[] args) {
        //What happens when you run the following code? Why is Arrays.toString necessary?
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        //Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        Person[] people = new Person[3]; // empty array thats expecting objects
        // creating objects for array items
        people[0] = new Person("Joe");
        people[1] = new Person("Jim");
        people[2] = new Person("Jacob");

        for(Person person : people){
            System.out.println(person.name);
        }

        System.out.println();
        Person[] morePeople = addPerson(people, new Person("Jason"));
        for (Person person : morePeople) {
            System.out.println(person);
        }

//        Person addThisPerson = new Person("Jason"); // forgot to add []
//
//        ArrayExercises.addPerson(people, addThisPerson);

//        for(Person addedPerson : addThisPerson){
//            System.out.println(addedPerson.name);
//        }

//        System.out.println(pe);



        //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.


    }

}
