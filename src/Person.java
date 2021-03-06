public class Person {
    public String name = "name";
    // returns the person's name
    public String getName() {
        return String.format("name: %s%n", name);
    }
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello %s%n", this.name);
    }

    //The class should have a constructor that accepts a string value and sets the person's name to the passed string.
    public Person(String newName) {
        this.name = newName;
    }

    //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
    public static void addPerson(Person[] peopleArray, Person personObj) {
        Person[] outputArr = new Person[peopleArray.length + 1];
        outputArr[outputArr.length-1] = personObj;
    }


    //For each code block, think about what the code will output, then copy the code into intellij and run it to see if it matches your expectation.
    //


    public static void main(String[] args) {


//        Person p1 = new Person("Joe");
//
//        p1.sayHello();
//        p1.getName();
//        p1.setName("JoeSet");
//        p1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true
//        System.out.println(person1 == person2); // false because of id#

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // true because person2 copies whatever person1's value is

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); // John
//        System.out.println(person2.getName()); // John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // Jane
//        System.out.println(person2.getName()); // Jane


    }
}
