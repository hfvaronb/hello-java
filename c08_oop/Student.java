package c08_oop;

public class Student {

    // Atributos
    int score = 0;

    // Métodos
    public void approved(int score){
        if (score >= 60) {
            System.out.println("Su calificacion es " + score + " ha aprobado");
        } else {
            System.out.println("Su calificacion es: " + score + ", No ha aprobado");
        }

    }
}
