public class Lambda_Expression {


    static void main(String[] args) {

//        car c = () -> System.out.println("Car is Started SucessFully ...");
        car c = (String message) -> message;
        System.out.println(c.start("Car Started Done .."));
    }

    interface car {
        String start(String message);

    }
    // ----> Medium Sum
//    static void main(String[] args) {
//        calcutor b = (a) -> (a * a);
//        System.out.println(b.square(12));
//    }
//
//    public interface calcutor {
//        int square(int a);
//    }


//-----> Easy Sum
//    public static void main(String[] args) {
//        Hello h = () -> System.out.println("Hello Java");
//        h.showMe();
//    }
//    interface Hello {
//        void showMe();
//    }
}
