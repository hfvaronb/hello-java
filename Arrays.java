public class Arrays {
    public static void main (String[] args) {

        // Declaración y creación
        int[] numbers = new int[3];
        System.out.println(numbers);

        String[] names = {"Hector", "Varon", "hvaron@gmail.com"};
        System.out.println(names);

        // Acceso
        System.out.println(numbers[0]);
        System.out.println(names[0]);

        System.out.println((new String[3])[0]);

        // Moodificación

        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

//        numbers[3] = 2; La posicion 3 no existe, Error

        System.out.println(names[2]);
        names[2] = "hvaron";
        System.out.println(names[2]);

        System.out.println(names.length);
        names[2] = null;
        System.out.println(names[2]);
        System.out.println(names.length);

//        numbers[2] = null; Error
        boolean [] booleans = new boolean[5];
        System.out.println(booleans[4]);



    }
}
