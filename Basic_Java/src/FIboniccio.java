import java.util.Scanner;

public class FIboniccio {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number To Find Fibonacci : ");
        long userInput = scanner.nextLong();
        long a = 0, b = 1;

        for (int i = 1; i <= userInput; i++) {
            System.out.println(a + " ");
            long next = a + b;
            a = b;
            b = next;


        }
    }
}
