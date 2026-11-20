import java.util.Scanner;

public class Array_06 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 2, 3, 50, 30, 90, 20};
        //     int max = arr[0];

        for (int elem : arr) {

            if (elem % 2 == 0) {
                System.out.println(elem + "Is Even Number");
            }
            System.out.println(elem + "Is Odd Number");

        }
        // System.out.println("Max Is : " + max);
    }

}
