package c08_oop;

public class Product {

    // Atributos
    String productName;
    double price;
    // float discountPercentage = 10;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Métodos

    public void productDiscount(double discountPercentage) {

        if (discountPercentage >= 0 && discountPercentage <= 1000) {
            double discountAmount = (price * (discountPercentage / 100) );
            price -= discountAmount;
            System.out.println("Descuento del  " + discountPercentage + " aplicado");
        } else {
            System.out.println("El descuento debe estar entre el 0 y el 100%");
        }
    }

    public void showPrice() {
        System.out.println("Precio del producto: " + String.format("%.2f",(price)));
    }





}
