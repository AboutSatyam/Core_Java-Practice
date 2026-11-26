import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reversed_Collection {
    static void main(String[] args) {
        List li = new ArrayList(List.of(91, 67, 57, 37));
        Collections.reverse(li);
        System.out.println(li);

    }
}