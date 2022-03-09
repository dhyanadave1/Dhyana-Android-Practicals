package androidPracticals;

class AirCraft {
    static int passenger = 10;
    static int speed = 140;
    static double fuelConsumptionRate = 150;
}

class Inheritance extends AirCraft {
    public static void main (String[] args) {
        System.out.println(passenger);
        System.out.println(speed);
        System.out.println(fuelConsumptionRate);
    }
}
