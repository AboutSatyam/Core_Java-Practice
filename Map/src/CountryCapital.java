import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCapital {
    static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("India", "New Delhi");
        map.put("Nepal", "Kathmandu");
        map.put("China", "Beijing");
        map.put("Bhutan", "Thimphu");
        map.put("Bangladesh", "Dhaka");

        System.out.println("Enter The Country name to find : ");
        Scanner scanner = new Scanner(System.in);

        String country = scanner.next();

        if (map.containsKey(country)) {
            System.out.println(map.get(country));
        } else System.out.println("Not Found >>> ");

    }

}
