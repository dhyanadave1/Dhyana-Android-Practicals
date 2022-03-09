package androidPracticals;

public class ExceptionHandlingExampleClass {
    public static void main (String[] args) {

        try {
            //code that may raise exception
            int data = 100/0;
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        }
        System.out.println("rest of the code is available to execute");
    }
}