import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {
    public static void main (String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int index = 1;
        while (index <= 10) {
            System.out.println("Número: " + index);
            index++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banano");
        fruits.add("Mango");
        fruits.add("Melón");
        fruits.add("Piña");
        fruits.add("Fresa");

        index = 0;

        do {
            System.out.println("Fruta: " + fruits.get(index));
            index++;
        } while (index < fruits.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

        // System.out.println(3 % 5);

        for (int i = 0; i <= 50; i++) {
            if((i % 5 ) == 0) {
                System.out.println("Numero: " + i + " es múltiplo de 5");
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.

        int[] numbers = {2, 5, 3, 4};

        int addition = 0;
        for (int i = 0; i < numbers.length; i++) {
            addition = numbers[i] + addition;
            // System.out.println(numbers[i]);
        }
        System.out.println("La suma de los elementos del array es: " + addition);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.

        String[] colors = {"Azul", "Amarillo", "Blanco", "Rojo", "Verde"};
        for (int i = 0; i < colors.length; i++){
            System.out.println("Color " + colors[i]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        HashSet<String> cities = new HashSet<>();
        cities.add("Paris");
        cities.add("Madrid");
        cities.add("Roma");
        cities.add("Malaga");

        for (String city: cities ) {
            System.out.println(city);
        }

        HashMap<String, String> cars = new HashMap<>();
        cars.put("BSK763","KIA RIO EX");
        cars.put("KFY556","KIA NEW SPORTAGE QL");
        cars.put("ICP679","GREAT WALL");
        cars.put("BZH077","RENAULT SYMBOL ALIZE");

        for (Map.Entry<String, String> car: cars.entrySet()) {
            System.out.println("PLACA: " + car.getKey());
            System.out.println("DESCRIPCIÓN: " + car.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

        for (int i = 10; i > 0; i--) {
            System.out.println("Conteo regresivo: " + i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
                // System.out.println(i + " es múltiplo de 3");
            }
            System.out.println(i + " no es múltiplo de 3 " + i);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un
        // array.

        int[] digits = {3, 1, -6, 8};
        System.out.println("Bucle que se detiene al encontrar un número negativo");
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < 0) {
                break;
            }
            System.out.println(digits[i]);
        }


        // 10. Crea un programa que calcule el factorial de un número dado.

        System.out.println("Programa que calcula el factorial de un número dado.");
        // factorial = n * (n - 1);

        int nFactorial = 4;
        int factorial = 1;
        System.out.println("Calcula el factorial de " + nFactorial);
        for (int i = 1; i <= nFactorial; i++) {
            factorial *= i;
            System.out.println(i + "! = " + factorial);
        }
        System.out.println("El factorial de " + nFactorial + " es: " + factorial);






    }
}
