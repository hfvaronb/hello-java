import java.util.*;

public class StructuresExercises {
    public static void main (String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.

        String[] cities = {"Bogota","Cali","Medellin", "Pereira", "Manizales"};

        System.out.println(cities.length);
        System.out.println(cities[0]);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes
        // y despuÃ©s de modificarlo.

        System.out.println(cities[2]);
        cities[2] = "Ibague";
        System.out.println(cities[2]);

        // 3. Crea un ArrayList vacío.

        var animals = new ArrayList<String>();
        System.out.println(animals.size());

        // 4. AÃ±ade 4 valores al ArrayList y elimina uno a continuación.

        animals.add("Perro");
        animals.add("Gato");
        animals.add("Loro");
        animals.add("Hamster");
        System.out.println(animals);

        animals.remove(1);

        System.out.println(animals);

        // 5. Crea un HashSet con 2 valores diferentes.

        HashSet<String> colors = new HashSet<>();
        colors.add("Azul");
        colors.add("Rojo");

        System.out.println(colors);

        // 6. AÃ±ade un nuevo valor repetido y otro sin repetir al HashSet.

        colors.add("Azul");
        colors.add("Verde");

        System.out.println(colors);

        // 7. Elimina uno de los elementos del HashSet.
        colors.remove("Rojo");
        System.out.println(colors);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de
        // teléfono. AÃ±ade tres contactos.

        HashMap<String, String> addressBook = new HashMap<>();

        addressBook.put("Jorge", "3014114135");
        addressBook.put("Andres", "3214951871");
        addressBook.put("Maria", "3005600672");

        System.out.println(addressBook);

        // 9. Modifica uno de los contactos y elimina otro.

        System.out.println(addressBook.get("Andres"));
        addressBook.replace("Andres", "3005688937");
        System.out.println(addressBook.get("Andres"));

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet
        // y finalmente en un HashMap con clave y valor iguales.

        // Declarar el array
        ArrayList<String> myFruits = new ArrayList<>();

        String[] fruits = {"Manzana", "Pera", "Banano", "Fresa"};
        System.out.println(fruits[0]);

        // Convertir el array en arrayList
        System.out.println("Convertir array en arrayList");
        Collections.addAll(myFruits, fruits);

        System.out.println(myFruits);

        // Convertir ArrayList en HashSet
        System.out.println("Convertir ArrayList en HashSet");
        HashSet<String> hashFruits = new HashSet<>(myFruits);

        System.out.println(hashFruits);

        // Convertir HashSet en HashMap

        System.out.println("Convertir HashSet a HashMap");

        HashMap<String, String> mapFruits = new HashMap<>();

        for (String fruit : hashFruits) {
            mapFruits.put(fruit, fruit);
        }
        System.out.println(mapFruits);

    }
}
