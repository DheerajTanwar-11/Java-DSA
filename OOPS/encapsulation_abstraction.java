/*
1. Encapsulation is defined as the wrapping up of data under a single unit.It is the mechanism that binds together code and the data it manipulates.
2. Encapsulation enables the concept of Data Hiding. And we use access modifer for data hiding.
3. Abstraction is a process of hiding the implementation details from the user and showing only the functionality to the user. It can be achieved by using abstract classes, methods, and interfaces.
4. Abstract class should have abstract keyword and abstract class can have abstract method and non-abstract method.
5. There is a concept of constructor chaining. Means first constructor of base class is called and then constructor of derived class is called.
*/

package OOPS;

public class encapsulation_abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk("Walks on 4 legs");
        Chicken chicken = new Chicken();
        chicken.walk("Walks on 4 legs");
        // Animal animal = new Animal(); // It will thorow an error because Object of
        // Animal class cannot be created because Animal is an abstract class.
    }
}

abstract class Animal {
    abstract void walk(String string); // Abstract function not need to write its implementation.

    Animal() {
        System.out.println("Created new Animal");
    }
} // It is an abstract class.

class Horse extends Animal {
    public void walk(String string) {
        System.out.println("Walks on 4 legs");
    }

    Horse() {
        System.out.println("Created New Horse");
    }
}

class Chicken extends Animal {
    public void walk(String string) {
        System.out.println("Walks on 2 legs");
    }
}