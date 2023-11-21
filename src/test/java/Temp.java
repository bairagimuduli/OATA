
import java.util.HashMap;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfInputs = 3;

        HashMap<String, String> property = new HashMap<>();
        for (int i = 0; i < noOfInputs; i++) {
            System.out.println("Enter the key");
            String key = scanner.nextLine();
            System.out.println("Enter the value");
            String value = scanner.nextLine();
            property.put(key, value);
        }

        System.out.println(property);

    }

}
