package OOPS;
/* 
1. OOPS stands for Object Oriented Programming language. 
2. Java is an Object Oriented programming language but it is not purely object oriented programming language because it consist of primitive data type like integer, float etc.
3. To make object of class we need Constructors. There are three types of Constructors: 
    * Non Parameterized Constructors :  className objectName = new className();
    * Parameterized Constructors : className objectName = new className(type parameter1, type parameter2);
    * Copy Constructors : It copies one object into another.
4. Properties of Constructors:
    * Name of class and constructor is same.
    * Constructor do not return anything.
    * For an object a constructor can be called only one time. And we call it during object declaration.
5. We do not need to write destructors in java seperately because java has automatic garbage collection which smartly free the memory allocated to objects after their use. 
6. Pillars of OOPS : There are 4 pillars in OOPS : 
    * Polymorphism
    * Abstraction
    * Encapsulation
    * Inheritance
*/

class oops {
    public static void main(String args[]) {
        Student student1 = new Student();
        student1.name = "Dheeraj Tanwar";
        student1.age = 23;
        student1.writeNameAge();
    }
}

class Student {
    String name;
    int age;

    public void writeNameAge() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student age: " + this.age);
    }

}
