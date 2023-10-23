/*
1. Polymorphism is made up of two words : Poly + Morphism
2. Poly means Many and Morphism mean Forms.
3. In total polymorphism means performin a single action in different ways.
4. There are two types of polymorphism : 
    * Function Overloading(Compile Time Polymorphism)
    * Function Overriding(Run Time Polymorphism)
5. Function Overloading means different functions with same names. So when we call the function, according to its parameters it will perform the task.
6. There are some rules to apply function overloading : 
    * Return type of each function should be different.
    * If return type of functions are same then parameter type should be different.
    * If return type and parameter type are same then number of parameters should be different.
*/

package OOPS;

class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Dheeraj";
        s1.age = 23;
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);

    }
}

class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}