package Loops;

import java.util.Scanner;

public class PasswordChecker {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Password;
        do {
            System.out.println("Plz Enter your password :");
            Password = scanner.next();
        } while (!isValidPassword(Password));
        System.out.println("thanks ");
    }
    public static boolean isValidPassword(String Password) {
        return Password.length() > 6;
    }
}
