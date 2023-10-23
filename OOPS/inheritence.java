/* 
1. Inheritence means inherit from one generation to another generation.
2. In java inheritence is process of taking properties of one class to another class. Means transfer of properties of parent class to child class.
3. Inheritence is use for code reusability.
4. In Java Inheritence has 4 types : 
    * Single Level Inheritence(Parent class => child Class)
    * Multi Level Inheritence(Parent class => Child Class => Child Class)
    * Hierarchial Inheritence(Single parent class and multiple child classes)
    * Hybrid Inheritence(All three types of inheritence at single place)
*/

package OOPS;

class OOPS {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.printColor();
        t1.area(3, 5);
        Equilateraltriangle t2 = new Equilateraltriangle();
        t2.printInfo();
        Circle c1 = new Circle();
        c1.area(5);
    }
}

class Shape {
    String color;

    public void area() {
        System.out.println("Display area");
    }
} // Parent Class

class Triangle extends Shape {
    public void area(int length, int height) {
        System.out.println((1.0 / 2) * length * height);
    }

    public void printColor() {
        System.out.println(this.color);
    }
} // Child Class Inherit Shape Class , Single Level Inheritence

class Circle extends Shape {
    public void area(int radius) {
        System.out.println(3.14 * radius * radius);
    }
} // Hierarchial Inheritence

class Equilateraltriangle extends Triangle {
    public void printInfo() {
        System.out.println("This is equilateral triangle.");
    }
} // Multilevel Inheritence