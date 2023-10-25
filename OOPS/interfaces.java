/* 
1. In java interface is just like class but with some fixed properties.
2. An interface in the Java programming language is an abstract type that is used to declare a behavior that classes must implement.
3. An interface does not have Constructor and they also dont have non-abstract methods.
4. All the fields in the interface are public, static and final by default.
5. Interfaces can have multiple inheritance.
6. Static keyword is use to make field static. By this each subclass or object will have the same value as baseclass.
*/

package OOPS;

public class interfaces {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}

interface Animal {
    public void walk();

    static int eyes = 2;
    // Animal(); // Interface does not have constructors.
    // public void eat(){} // Interface does not have non abstract method and no
    // implementation of methods.
}

interface Herbivore {
    void eat();
}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }

    public void eat() {
        System.out.println("Vegetarian");
    }
} // Multiple Inheritance
  // When we make derived class of interface then we use implement keyword.
