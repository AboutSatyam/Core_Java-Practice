public class Loop {
    static void main(String[] args) {
        int a = -10, b = 0;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a= " + a + " And b= " + b);
    }
}
