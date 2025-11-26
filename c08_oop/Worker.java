package c08_oop;

public class Worker {

    // Atributos

    String name;
    Double salary;

    // Constructor
    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Métodos

    public void showEmployee() {
        System.out.println("El salario del empleado " + name + " es de " + salary);
    }


}
