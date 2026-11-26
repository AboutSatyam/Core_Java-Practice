import java.util.Enumeration;
import java.util.Vector;

public class Enurmationn {
    static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Enumeration<Integer> e = list.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }
}
