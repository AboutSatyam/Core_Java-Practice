import java.util.Scanner;

public class EvenPrinter {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number to print Even Number : ");
        long userInput = scanner.nextLong();
        int sum = 0;

        for (int i = 0; i <= userInput; i++) {
            sum = (i * 2);
            System.out.print(sum + " ");
        }
    }
}
