import java.util.Scanner;

public class UserInput_03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter The " + i + " Element : ");
            arr[i] = scanner.nextInt();
        }

        System.out.print(" The Entered Element Are : ");
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
