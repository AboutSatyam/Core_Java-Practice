package Loops;

import java.util.Scanner;

public class RandomNoGuesserGame {
    static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int user;
        int guesser;
        boolean isVaild;

        System.out.print("Silently Enter The Number You Want Guess From Guesser : ");
        user = Scan.nextInt();

        do {
            System.out.println("Guess the no : ");
            guesser = Scan.nextInt();
        } while (!isVaildPass(guesser, user));
        System.out.println(" yepppppp correct ");
    }

    private static boolean isVaildPass(int guesser, int user) {
        return user == guesser;
    }
}
