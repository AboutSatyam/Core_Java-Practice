public class SecondMark {

    static void getMethod(int mark) throws MarkExcep {
        if (mark < 40) {
            throw new MarkExcep("Student Failed");
        }

        System.out.println("Student Passed Successfully");
    }

    static void main(String[] args) {
        try {
            getMethod(5);
        } catch (MarkExcep e) {
            System.out.println(e.getMessage());
        }
    }
}