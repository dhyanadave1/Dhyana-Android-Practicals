package androidPracticals;

public class LoopExampleClass {
    public static void main (String[] args) {

        //for loop
        for (int num = 1; num <= 5; num++) {
            System.out.println(num);
        }

        //do while loop
        int value = 1;
        int sum = 0;
        do {
            sum = sum + value;
            value++;
        } while (value <= 10);
        System.out.println (sum);

        //while loop
        int count = 1;
        while (count < 5) {
            System.out.println("Count is: " + count);
            count ++;
        }
    }
}
