public class OperatorsExercises {
    public static void main (String[] args) {
        // 1. Crea una variable con el resultado de cada operación aritmética.

        // Suma
        int sum = 1 + 2;
        System.out.println(sum);

        // Resta
        int sustract = 4 - 1;
        System.out.println(sustract);

        // Multiplicación
        int multiplication = 5 * 2;
        System.out.println(multiplication);

        // División
        int division = 8 / 2;
        System.out.println(division);

        // Modulo
        int module = 8 % 3;
        System.out.println(module);

        // 2. Crea una variable para cada tipo de operación de asignación.

        var x = 12;
        var y = 2;

        //Asignación

        y = x;

        System.out.println(y);
        y += 2;

        System.out.println(y);
        y -= 2;

        System.out.println(y);
        y *= 2;

        System.out.println(y);
        y /= 2;

        System.out.println(y);
        y %= 2;


        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de
        // comparación.

        System.out.println("Comparaciones");
        System.out.println((2 < 3));
        System.out.println((x >= y));
        System.out.println(7 != 3);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println(7 <= 3);
        System.out.println(y > 3);
        System.out.println(x == y);

        // 5. Utiliza el operador lógico and.
        System.out.println("Operador Y (&&))");
        System.out.println((5 < 8) && (2 > 2));

        // 6. Utiliza el operador lógico or.
        System.out.println("Operador  OR (||)");
        System.out.println((5 != 8) || (2 > 1));

        // 7. Combina ambos operadores lógicos.

        var status = "active";

        System.out.println("Combinacion de Operadores && - ||");
        System.out.println((5 < 8) && (2 > 1) || status == "ctive");

        // 8. Añade alguna negación.

        System.out.println((status != "active"));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        System.out.println(x++);
        System.out.println(++x);
        System.out.println(-x);


        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println((5 + 3) < (2 * 3) || (3 < 2));
        System.out.println( true || false);
    }
}
