public class ConditionalsExercises {
    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a
        // 18).

        var age = 18;

        if (age >= 18) {
            System.out.println("El usuario puede votar");
        } else {
            System.out.println("El usuario NO puede votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        int number1 = 6;
        int number2 = 6;

        if (number1 > number2) {
            System.out.println("El primer número: " + number1 + " es mayor que el segundo número: " + number2);
        } else if (number2 > number1) {
            System.out.println("El segundo número: " + number2 + " es mayor que el primer número: " + number1);
        } else {
            System.out.println("Los dos números: " + number1 + " y " + number2 + " son iguales");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        int numberToVerify = -2;

        if (numberToVerify > 0) {
            System.out.println("El número a verificar " + numberToVerify + " es positivo");
        } else if (numberToVerify < 0) {
            System.out.println("El número a verificar " + numberToVerify + " es negativo");
        } else {
            System.out.println("El número a verificar es " + numberToVerify);
        }

        // 4. Crea un programa que diga si un número es par o impar.

        int itsEven = 3;

        if (itsEven % 2 == 0) {
            System.out.println("El número " + itsEven + " es par");
        } else {
            System.out.println("El número " + itsEven + " es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.

        int number = 101;

        if (number >= 0 && number <= 100) {
            System.out.println("El número " + number + " esta entre 0 y 100");
        } else {
            System.out.println("El número " + number + " esta fuera del rango entre 0 y 100");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con
        // switch.

        var weekDay = 8;

        switch (weekDay) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
            default:
                System.out.println("Número de dia fuera de rango");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
        // "Suspenso" según la nota (0-100).

        var qualification = -1;

        if (qualification >= 0 && qualification <= 50) {
            System.out.println("Mayor o igual a 0 y menor o igual a 50, Suspenso");
        } else if (qualification > 50 && qualification < 70) {
            System.out.println("Mayor a 50  y menor a 70, aprobado");
        } else {
            System.out.println("Mayor a 70 y menor o igual a 100, sobresaliente");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al
        // menos 15 aÃ±os o ir acompaÃ±ado.

        var cinemaAge = 1;

        if (cinemaAge < 15) {
            System.out.println("Menor a 15 años, debe entrar acompañado.");
        } else {
            System.out.println("Puede entrar solo");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        var letter = "z";

        switch (letter) {
            case "a":
                System.out.println("a es vocal");
                break;

            case "e":
                System.out.println("e es vocal");
                break;
            case "i":
                System.out.println("i es vocal");
                break;
            case "o":
                System.out.println("o es vocal");
                break;
            case "u":
                System.out.println("u es vocal");
                break;
            default:
                System.out.println("Es consonante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        int a = 1;
        int b = 1;
        int c = 5;

        if (a > b && a > c) {
            System.out.println("A es mayor que B y mayor que C");
        } else if (b > c && b > c) {
            System.out.println("B es mayor que A y mayor que C");
        } else if (c > a && c > b) {
            System.out.println("C es mayor que A y mayor que B");
        } else {
            System.out.println("Dos o mas números son iguales.");
        }
    }
}