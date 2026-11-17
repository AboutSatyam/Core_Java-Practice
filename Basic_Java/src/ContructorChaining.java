public class ContructorChaining {

    public ContructorChaining() {
        this(20); // Calls parameterized constructor bhai
        System.out.println("Default Constructor");
    }

    public ContructorChaining(int a) {
        System.out.println("Value: " + a);
        System.out.println("Parametrizerd Constructor");

    }

    public static void main(String[] args) {
        ContructorChaining obj = new ContructorChaining();
    }
}