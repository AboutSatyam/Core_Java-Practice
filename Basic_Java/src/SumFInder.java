import java.util.Scanner;

public class SumFInder {
    static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number To See The Series of Sum  : ");
        long userInput = scanner.nextLong();
        for (int i = 0; i <= userInput; i++) {
            sum += i;
        }
        System.out.println(" Sum Is : " + sum);
    }
}
