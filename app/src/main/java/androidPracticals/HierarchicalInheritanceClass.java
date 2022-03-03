package androidPracticals;

class Animal {
    void eat() {
        System.out.println("eating..");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

class HierarchicalInheritanceClass {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }
}