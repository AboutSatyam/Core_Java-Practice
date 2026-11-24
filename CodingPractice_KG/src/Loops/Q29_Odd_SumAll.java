package Loops;

import java.util.Scanner;

public class Q29_Odd_SumAll {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Odd No Sum ALl Cal");
        System.out.print("Enter the Number till you want to print : ");
        int userInput = scanner.nextInt();
        int i = 1;
        int sum = 0;
        for (i = 1; i <= userInput; i += 2) {
            sum += i;
        }
        System.out.println("Total Sum iS " + sum);

    }
}
