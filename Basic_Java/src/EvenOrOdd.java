import java.util.Scanner;

public class EvenOrOdd {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number To Check Even Or Odd : ");
        int userNo = scanner.nextInt();
        if (userNo % 2 == 0) {
            System.out.println(userNo + " Even Number");
        } else {
            System.out.println(userNo + " Odd Number");

        }
    }
}
