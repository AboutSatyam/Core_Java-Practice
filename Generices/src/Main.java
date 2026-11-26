import java.util.*;

class Students {
    String name;
    int age;

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Students> {

    @Override
    public int compare(Students s1, Students s2) {
        return Integer.compare(s1.age, s2.age);
    }
}
public class Main {
    public static void main(String[] args) {

        List<Students> list = new ArrayList<>();

        list.add(new Students("Rahul", 25));
        list.add(new Students("Amit", 20));
        list.add(new Students("Rohit", 22));

        Collections.sort(list, new AgeComparator());

        for (Students s : list) {
            System.out.println(s.name + " " + s.age);
        }
    }
}