public class AgePrcatical {
    static void main(String[] args) {
        int age = 63;
        try {
            if (age < 18) {
                throw new AgeExcep(" Not Egible ");
            }
            System.out.println("Egilble");
        } catch (AgeExcep e) {
            System.out.println(e.getMessage());
        }
    }
}
