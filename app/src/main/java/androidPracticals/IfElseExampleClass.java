package androidPracticals;

public class IfElseExampleClass {
    public static void main(String[] args) {
        int value = 10;
        if (value == 10) {
            if (value < 15)
                System.out.println ("value is smaller than 15");
            if (value < 12)
                System.out.println ("value is smaller than 12 too");
            else
                System.out.println ("value is greater than 15");
        }
    }
}