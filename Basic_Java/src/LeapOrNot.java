import java.util.Scanner;

public class LeapOrNot {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Year To Check leap or not : ");
        int userYr = scanner.nextInt();

        if (userYr % 400 == 0 || (userYr % 4 == 0 && userYr % 100 != 0)) {
            System.out.println(userYr + " Leap Year ");
        } else {
            System.out.println(userYr + " Not a Leap Year ");
        }
    }
}
