/**
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 */

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




