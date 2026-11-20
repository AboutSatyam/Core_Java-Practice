public class Basic {
    static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException("Invaild Input ");

        } else {
            int c = a / b;
            System.out.println(c);
        }

    }
}
