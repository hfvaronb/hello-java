public class VariablesAndConstants {
    public static void main (String[] args) {

//        Variables
        String name = "Mariana";
        String lastName = "Varon Tovar";
        System.out.println(name);

//        lastName = 21; Error (no podemos cambiar el tipo de dato )

        int age = 21;
        System.out.println(age + " meses");

        var email = "hectorvaron@mail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

//        Constantes

        final String EMAIL = "info@globaltic.co";
//        EMAIL = "in@gmail.com"; Es constante
        System.out.println(EMAIL);

    }
}
