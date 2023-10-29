public class Programme_18_SimpleCalculator {

    double firstNo;
    double secondNo;

    public double getFirstNumber() {return firstNo;}

    public double getSecondNumber() {return secondNo;}

    public void setFirstNumber(double firstNo) {this.firstNo = firstNo;}

    public void setSecondNumber(double secondNo) {this.secondNo = secondNo;}

    public double Addition() {return getFirstNumber() + getSecondNumber();}

    public double Subtraction() {return getFirstNumber() - getSecondNumber();}

    public double Multiply() {return getFirstNumber() * getSecondNumber();}

    public double Divide() {
        if (getSecondNumber() == 0) {return 0;}
        else
        return getFirstNumber() / getSecondNumber();
    }

    public static void main(String[] args) {
        Programme_18_SimpleCalculator calculator = new Programme_18_SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("Addition = " + calculator.Addition());
        System.out.println("Subtraction = " + calculator.Subtraction());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiply = " + calculator.Multiply());
        System.out.println("Divide = " + calculator.Divide());
    }
}




