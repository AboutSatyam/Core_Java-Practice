import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorr {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> itr = list.listIterator(list.size());
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
//            itr.remove();
        }
        System.out.println("--------------------");

        //  System.out.println(list);
    }
}
