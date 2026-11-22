import java.util.Scanner;

public class OddPrinter {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number to print Even Number : ");
        long userInput = scanner.nextLong();
        int sum = 0;
        for (int i = 1; i <= userInput; i++) {
            sum = ((i * 2) - 1);
            System.out.print(sum + " ");
        }

    }
}
