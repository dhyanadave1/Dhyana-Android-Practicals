package androidPracticals;

public class ExceptionClass {
    public static void main(String[] args) {

        try {
            int firstValue = 20;
            int div,secondValue = 0;
            div = firstValue / secondValue;
            System.out.println("Output:" +div);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("We cannot divide any number by zero.");
        }

        try {
            int num = Integer.parseInt("Hello Dhyana");
            System.out.println(num);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Number Format Exception has occured");
        }

        try {
            int[] array = new int [10];
            array[11] = 10;
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Array size out of bound");
        }
    }
}
