package c08_oop;

public class Rectangle {

    // Atributos
    float perimetro = 0;
    float area = 0;
    
    // Métodos area y perimetro
    public void area(float b, float h){
        if ((b <= 0 || h <= 0)) {
            System.out.println("La base o altura es igual a 0");
        } else {
            System.out.println("El área del rectángulo es: " + b * h);
        }

    }

    public void perimetro(float b, float h) {
        if ((b <= 0 || h <= 0)) {
            System.out.println("La base o altura es igual a 0");
        } else {
            System.out.println("El perímetro del rectangulo es: " + (2*(b) + 2*(h)));
        }
    }

}
