import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {

    public static void main (String[] args) {

        // Loops

        // For controlado por contador

        for (int index = 0; index < 5; index++) {
            System.out.println("Hola, Java!");
        }

        String[] names = {"Mariana", "Uly", "Hector", "Alexandra", "Fabian"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }

        // for-each  loop ideal para recorrer array o listas

        for (String name: names) {
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number: numbers) {
            System.out.println(number);
        }

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Alexandra","alexandra@gmail.com");
        emails.put("Mariana","mariana@gmail.com");
        emails.put("Hector","hectorvaron@gmail.com");

        for (Map.Entry<String, String> email: emails.entrySet()) {
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }

        // While

        int index = 0;
        while (index < 5) {
            System.out.println("Hola While en Java!");
            index ++;
        }

        index = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[index]);
            if (names[index].equals("Hector")){
                find = true;
            }
            index++;
        }
         // - do-while

        index = 0;
        do {
            System.out.println("Hola While en Java!");
            index++;
        } while (index < 0);

        // Control de bucles

        // - break

        for (String name: names) {
            if (name.equals("Hector")) {
                break;
            }
            System.out.println(name);
        }

        // - continue

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}



