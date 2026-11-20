public class Array_02 {
    static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        System.out.println(arr[2]);
        System.out.println("-------------------------------");
        arr[4] = 100;
        for (int elem : arr) {
            System.out.println(elem);
        }
    }
}
