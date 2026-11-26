import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorr {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            itr.remove();

        }
        System.out.println("--------------------");

        System.out.println(list);
    }
}
