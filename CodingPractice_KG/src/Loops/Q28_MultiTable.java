package Loops;

import java.util.Scanner;

public class Q28_MultiTable {
    static Scanner Scan = new Scanner(System.in);

    static void main(String[] args) {
        System.out.println("Welcome To Multiplication table Calculator   ");
        System.out.print(" Enter The Number : ");
        int n = Scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            int mul = n * i;
            System.out.println(n + " x " + i + " = " + mul);
        }
    }
}
