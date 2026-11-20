import java.util.Scanner;

public class Example_04 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Size Of the Array : ");
        int usize = scanner.nextInt();

        int[] arr = new int[usize];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" Enter The " + i + "  Element  ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("The Entered Element are ");

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
