import java.util.Scanner;

public class MarkPractical {

    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your mark : ");
        int mark = scan.nextInt();

        try {
            if (mark < 40) {
                throw new MarkExcep("Student Failed");
            }
            System.out.println("Student Passed SuccessFully : ");


        } catch (MarkExcep e) {
            // System.out.println("Student Failed !! ");
            System.out.println(e.getMessage());
//            System.out.println(e.getCause());

        }
    }
}