public class StringExercises {
    public static void main (String []args ) {

        // 1. Concatena dos cadenas de texto.
        var greet = ("Buenas tardes");
        var name =("Jose");
        System.out.println(greet + name);

        // 2. Muestra la longitud de una cadena de texto.

        System.out.println(greet.length());

        // 3. Muestra el primer y último carácter de un string.

        var char1 = (name.charAt(0));
        var char2 = (name.charAt(name.length()-1));

        System.out.println(char1 + " " + char2);

        // 4. Convierte a mayÃºsculas y minÃºsculas un string.

        System.out.println(greet.toUpperCase());
        System.out.println(greet.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.

        System.out.println(greet.contains("tard"));

        // 6. Formatea un string con un entero.

        int followers = 4200;
        String nickname = "Hector Varon";
        String cardNumber = "1234567";

        int number;
        number = Integer.parseInt(cardNumber);
        System.out.println(number);

        System.out.println(String.format("Mi alias es %s y tengo %d seguidores", nickname, followers));

        // 7. Elimina los espacios en blanco al principio y final de un string.

        var phrase =" No tengas miedo de fallar, ten miedo de no intentarlo ";
        System.out.println(phrase);
        System.out.println(phrase.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guiÃ³n (-).

        System.out.println(phrase.replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.

        var country = "colombia";
        System.out.println(country.equals("COLOMBIA"));

        // 10. Comprueba si dos strings tienen la misma longitud.

        var text1 = "pais";
        var text2 = "ciuda";

        boolean equaLength1 = (text1.length() == text2.length());

        System.out.println("text1 == text2: " + equaLength1);


    }
}
