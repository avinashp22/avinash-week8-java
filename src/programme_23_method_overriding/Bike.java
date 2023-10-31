/**
 * Example of method overriding (Create package name ‘methodoverriding23’ and create all below classes in this package)
 */

package programme_23_method_overriding;

public class Bike extends Vehicle{

    public void run (){System.out.println("Bike is running safely");}

    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }

}
