public class Bnk_main {
    static void main(String[] args) {
        int balance = 10000;
        int withdraw = 2000;

        if (withdraw > balance) {
            throw new BnkExcept("Insuffiecient Balance ");
        }
        System.out.println("Current Balance " + (balance - withdraw));
    }

}
