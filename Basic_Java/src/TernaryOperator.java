public class TernaryOperator {
    static void main(String[] args) {

        // 2 integer
        int a = 11;
        int b = 12;
        int res = (a >= b) ? a : b;
        System.out.println(res);

        // 3 integer

        int c = 15;

        int res1 = (a > c) ? ((a > b) ? a : b) : ((b > c) ? b : c);
        System.out.println(res1);
    }
}
