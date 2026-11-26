public class enum_days {
    static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

    }
}
