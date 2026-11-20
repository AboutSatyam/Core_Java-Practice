public class AgeRetriction {
    static void CheckAgeE(int age) throws AgeExcep {
        if (age < 18) {
            System.out.println("not Egiblie");
        }
        System.out.println(" Egiblie");

    }

    static void main(String[] args) {
        try {
            CheckAgeE(33);
        } catch (AgeExcep e) {
            System.out.println(e.getMessage());
        }
    }
}
