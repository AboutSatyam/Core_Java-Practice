package Arrays;

public class SkipNegative {
    static void main(String[] args) {
        System.out.println("Welcome to sum cal and skip negative ");
        int[] arr = ArrayUtility.inputArray();

        int sum = 0;
        for (int elem : arr) {
            if (elem < 0) {
                continue;
            }
            sum += elem;
        }
        System.out.println("Sum of all postive no is " + sum);
    }
}
