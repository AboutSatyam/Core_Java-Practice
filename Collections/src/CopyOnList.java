import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnList {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();  //ERROR
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            int num = itr.next();

            if (num == 20) {
                list.add(40);
            }
            System.out.println(num);
        }
        System.out.println(list);
    }
}
