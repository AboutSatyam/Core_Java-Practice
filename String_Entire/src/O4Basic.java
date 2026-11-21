public class O4Basic {
    static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        //  str+="Hello";
        str.append(" WORLD");
        System.out.println(str);
        str.delete(0, str.length());
        System.out.println(str);

    }
}
