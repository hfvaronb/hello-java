import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {

    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde
        // cero!".
        courseGreet();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa
        // persona.
        personGreet("Juan Andres");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        substraction(5, 2);

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        System.out.println("El cuadrado de 8 es " + numberSquared(8));

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        evenOrOdd(3);

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y
        // false en caso contrario).
        System.out.println(legalAge(17));

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        String text = "Hola mundo";
        int length = stringLength(text);
        System.out.println("La longitud de " + text + " es " + length);
        System.out.println("La longitud de 'Programa' es " + stringLength("Programa"));

        // 8. Crea un método que reciba un array de enteros, calcula su media y lo
        // retorna.

        int [] numbers = { 2, 4 };

        double media = calculateMedia((numbers));
        System.out.println("La media del array es: " + media);

        // 9. Escribe un método que reciba un número y retorna su factorial.
        int resultFactorial = factorial(4);
        System.out.println("El factorial de 4 es " + resultFactorial);
        System.out.println(("El factorial de 8 es " + factorial(8)));


        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando
        // cada elemento.
        var countries = new ArrayList<>(Arrays.asList("Colombia", "Brasil", "Chile"));
        showArrayList(countries);

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Azul");
        colors.add("Blanco");
        colors.add("Verde");
        showArrayList(colors);

        // Ejemplo mostrando sobrecarga de métodos
        printInfo("Hector", 42, "Ingeniero de Software");

    }

    // 1. Función de bienvenida a curso.
    public static void courseGreet() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde");

    }

    // 2. Función de saludo a persona.
    public static  void personGreet(String name) {
        System.out.println("Hola buen día " + name);
    }

    // 3. Función que devuelve la resta de dos números.
    public static void substraction(Integer minuend, Integer subtracting) {
        System.out.println("La resta entre " + minuend + " y " + subtracting + " es: " + (minuend - subtracting));
    }

    // 4. Función que calcula el cuadrado de un número (n * n).
    public static int numberSquared(int number) {
        return (number * number);
    }

    // 5. Función que recibe un número y dice si es par o impar
    public static void evenOrOdd(int number) {
        if(number % 2 == 0) {
            System.out.println(number + " es par");
        } else {
            System.out.println(number + " es impar");
        }
    }

     // 6. Función que recibe una edad y retorne true si es mayor de edad
    public static boolean legalAge(int age) {
        if(age < 18) {
            return false;
        }
        System.out.println("Mayor");
        return true;
    }

    // 7. Función que recibe una cadena y retorne su longitud
    public static int stringLength(String text) {
        return text.length();
    }

    // 8. Funcion que recibe un array de enteros, calcula su media y lo retorna
    public static double calculateMedia(int [] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }

        int addition = 0;
        for (int number : numbers) {
            addition += number;
        }

        return (double) addition / numbers.length;
    }

    // 9. Función que recibe un número y retorna su factorial.
    public static int factorial(Integer number) {
        if (number <= 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // 10. función que reciba un ArrayList<String> y lo recorra mostrando
    // cada elemento.

    public static void showArrayList(ArrayList<String> countries) {
        for (String country:countries) {
            System.out.println(country);
        }
    }

    // Ejemplos adicionales de sobrecarga de métodos
    public static void printInfo(String name) {
        System.out.println("Nombre: " + name);
    }

    public static void printInfo(String name, int age) {
        System.out.println("Nombre: " + name +  ", Edad: " + age);
    }

    public static void printInfo(String name, int age, String profession) {
        System.out.println("Nombre: " + name + ", Edad: " + age + ", Profesión: " + profession);
    }

}
