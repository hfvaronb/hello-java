package c08_oop;

public class Product {

    // Atributos
    String productName;
    double price;
    float discountPercentage = 10;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Métodos

    public void productDiscount() {
        System.out.println("Precio del producto " + price);
        double discountAmount = (price * (discountPercentage / 100) );
        System.out.println("El descuento del producto " + productName + " es de " + String.format("%.2f",discountAmount));
        System.out.println("El precio con descuento del producto " + String.format("%.2f",(price - discountAmount)));
    }

}
