public class Strings {
    public static void main (String [] args) {

        String name = "Hector";
        var surname = new String("Varon");

        // Operacione básicas

        // Concatenación
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        // Obtener caracter
        System.out.println(name.charAt(name.length()-1));

        // Subcadena
        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 5));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("Hector"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        // Comparación
        System.out.println(name.equals("hector"));
        System.out.println(name.equalsIgnoreCase("hector"));

        // Trim
        System.out.println(" Hola, me llamo hector ".trim());

        //Replace
        System.out.println("Hola, me llamo Fabio". replace("Fabio", "Hector"));

        // Format
        var age = 42;
        System.out.println(String.format("Hola soy %s y tengo %d", name, age));
    }
}
