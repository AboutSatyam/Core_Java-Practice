package Arrays;

import java.util.Scanner;

public class ArrayUtility {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome To Array Utility");
        int[] numArray = inputArray();
        System.out.println("Your 1D Array Elements Are:");
        dispArray(numArray);
        System.out.println();
        int[][] num2DArray = input2DArray();
        System.out.println("Your 2D Array Elements Are:");
        disp2DArray(num2DArray);
    }

    public static int[] inputArray() {

        System.out.println("Enter the Number of Elements means size: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter Elements " + (i + 1) + " : ");
            nums[i] = scanner.nextInt();
        }
        return nums;
    }

    public static int[][] input2DArray() {
        System.out.println("Enter the Number of Rows means size: ");
        int row = scanner.nextInt();
        System.out.println("Enter the Number of Coloumn means size: ");
        int colm = scanner.nextInt();
        int[][] nums = new int[row][colm];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                nums[i][j] = scanner.nextInt();
            }
        }
        return nums;
    }

    public static void dispArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void disp2DArray(int[][] nums) {
        for (int[] row : nums) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}