public class BeginnerExercises {
    public static void main (String[] args) {
//        1. Declara una variable de tipo String y asígnale tu nombre

        String name = "Hector";
        System.out.println(name);
//        2. Crea una variable de tipo int y asígnale tu edad.
        int age = 42;
        System.out.println(age);
//        3. Crea una variable double con tu altura en metros.
        Double height = 1.72;
        System.out.println(height);
//        4. Declara una variable de tipo boolean que indique si te gusta
//        programar.
        boolean programmer = true;
        System.out.println(programmer);
//        5. Declara una constante con tu email.
        final String EMAIL = "hectorvaron@gmail.com";
        System.out.println(EMAIL);
//        6. Crea una variable de tipo char y guárdale tu inicial.
        char initial = 'H';
        System.out.println(initial);

//        7. Declara una variable de tipo String con tu localidad, y a
//        continuación cambia su valor y vuelve a imprimirla.
        String city = "Bogota";
        city = "Cota";
        System.out.println(city);
//        8. Crea una variable int llamada a, otra b, e imprime la suma de
//        ambas.
        int a = 5;
        int b = 8;
        System.out.println(a + b);
//        9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(city.getClass().getSimpleName());
        System.out.println(((Object)a).getClass().getSimpleName());
//        10. Intenta declarar una variable sin inicializarla y luego
//        asígnale un valor antes de imprimirla.
        String status;
        status = "Active";
        System.out.println(status);
    }
}

