/**
 * A real example of Java Method Overriding (Create package name
 * ‘methodoverriding24’ and create all below classes in this package)
 */

package programme_24_method_overriding;

public class Test {

    public static void main(String[] args) {

        Sbi s = new Sbi();
        Icici i = new Icici();
        Axis a = new Axis();

        System.out.println("SBI Interest Rate is " + s.getRateofInterest());
        System.out.println("ICICI Interest Rate is " + i.getRateofInterest());
        System.out.println("AXIS Interest Rate is " + a.getRateofInterest());

    }



}
