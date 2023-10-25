/*
1. Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class.
2. There are 4 types of Access Modifiers in Java :
    * Public Access Modifier : Using public keyword will grand access to anyone.
    * Default Access Modifier : We don not need to specify it. And it will accessible only in its package.
    * Protected Access Modifier : It will accessibel in its package but outside the package only subclasses can access it.
    * private Access Modifier : It will only be accessible in its class only.
3. To access private Access Modifier, we need getter and setter.
*/

package OOPS;

public class accessmodifiers {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Dheeraj Tanwar";
        account1.email = "dheerajtanwar444@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}

class Account {
    public String name; // Public access modifier
    protected String email; // Protected Access modifier
    private String password; // Private access modifier

    public String getPassword() {
        return this.password;
    } // Getter

    public void setPassword(String pass) {
        this.password = pass;
    } // Setter
}
