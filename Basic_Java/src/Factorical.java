import java.util.Scanner;

public class Factorical {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number To Find Factorical : ");
        long userNo = scanner.nextLong();
        long fact = 1;
        for (int i = 1; i <= userNo; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
