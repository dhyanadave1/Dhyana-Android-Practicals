package androidPracticals;

public class SwitchCaseExampleClass {
    public static void main (String[] args) {
        String value = "Green";

        switch (value) {
            case "Yellow":
                System.out.println("Value is Yellow");
                break;

            case "Green":
                System.out.println("Value is Green");
                break;

            default:
                System.out.println("Value is neither Yellow nor Green");
                break;
        }
    }
}