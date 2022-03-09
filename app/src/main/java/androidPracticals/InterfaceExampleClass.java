package androidPracticals;

interface Printable {
    void print();
}
interface Showable {
    void show();
}

class Interface implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }
    public void show() {
        System.out.println("Welcome");
    }

    public static void main (String[] args) {
        Interface interfaceObj = new Interface();
        interfaceObj.print();
        interfaceObj.show();
    }
}