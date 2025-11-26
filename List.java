import java.util.ArrayList;

public class List {
    public static void main (String[] args) {


        //        Declaracion y creacion

        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        //        Tamaño

        System.out.println(names.size());

        //        Añadir elementos

        names.add("Hector");
        names.add("Jose");
        names.add("Pedro");
        System.out.println(names.size());

//        Acceder a los elementos

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

//        Modificar elementos

        names.set(1, "hvaron@gmail.com");
        System.out.println(names.get(1));

//        Eliminar elementos

        names.remove(2);
//        System.out.println(names.get(2)); // Error

//        Buscar elementos

        System.out.println(names.contains("Brais"));
        System.out.println(names.contains("Hector"));

//        Limpiar array
        names.add("Hector");
        System.out.println(names);
        names.clear();
        System.out.println(names.size());
    }
}
