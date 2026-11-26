import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Rahul", 25));
        list.add(new Student("Amit", 20));
        list.add(new Student("Rohit", 22));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s.name + " " + s.age);
        }
    }

    @Override
    public int compareTo(Student s) {
        return this.age - s.age; // Main Logic
    }
}