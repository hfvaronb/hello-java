import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        // Declaración y creacion
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        //        Tamaño

        System.out.println(names.size());

        //        Añadir elementos

        names.put("Hector", "hvaron@gmail.com");
        names.put("Fabio", "fabio@gmail.com");
        names.put("Mariana", "mariana@gmail.com");

        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos

        System.out.println(names.get("Hector"));
        System.out.println(names.get("Dev"));

        // Verificar elementos

        System.out.println(names.containsKey("Hector"));
        System.out.println(names.containsKey("Dev"));

        System.out.println(names.containsValue("hvaron@gmail.com"));

        // Eliminar elementos

        System.out.println(names.remove("Fabio"));
        System.out.println(names);

        // Limpiar HasMap

        names.clear();
        System.out.println(names);

        // Modificación de elementos

        names.put("Alexa", "alexa@gmail.com");
        System.out.println(names);

        names.put("Alexa", "alexandra_santoya");
        System.out.println(names);

        names.replace("Alexa", "alexa_santoya@yahoo.com");
        System.out.println(names);

        names.putIfAbsent("Mariana", "marianatovar@yahoo.com");
        System.out.println(names);

        // Otras operaciones

        System.out.println(names.isEmpty());
        System.out.println(names.values());
        System.out.println(names);


    }
}
