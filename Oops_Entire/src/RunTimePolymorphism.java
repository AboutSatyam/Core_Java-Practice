class Parent {
    void show() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Hello from Child");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {

        Parent p = new Child();
        p.show();
    }
}