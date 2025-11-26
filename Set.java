import java.util.HashSet;

public class Set {

    public static void main(String[] args) {

//        Declaracion y creación

        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño

        System.out.println(names.size());

        //        Añadir elementos

        names.add("Hector");
        names.add("Fabio");
        names.add("hfvaron");
        names.add("hectorvaron@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(4);

//        Eliminar elementos

        names.remove("Fabio");
        System.out.println(names.size());


//        Buscar elementos

        System.out.println(names.contains("Brais"));
        System.out.println(names.contains("Hector"));

        System.out.println(names);
        names.add("Hector");
        names.add("Hector");
        names.add("Hector");

        // Conjuntos

//        names.addAll(numbers); Error

        //        Acceder a los elementos
        var countries = new HashSet<String>();
        countries.add("Colombia");
        countries.add("Venezuela");
        countries.add("Ecuador");
        countries.add("hfvaron");

        names.addAll(countries);

        System.out.println(names);

//        names.removeAll(countries);
        System.out.println(names);

        names.retainAll(countries);

        System.out.println(names);
    }
}
