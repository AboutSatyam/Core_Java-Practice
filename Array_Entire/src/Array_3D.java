public class Array_3D {
    static void main(String[] args) {
        System.out.println(" , ");
        int[][][] arr = {{{7, 8, 9}, {10, 11, 12}

        }, {{1, 2, 3}, {4, 5, 6}

        }};
        //System.out.println(Arrays.deepToString(arr);
        for (int[][] a : arr) {
            for (int[] b : a) {
                for (int c : b) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
