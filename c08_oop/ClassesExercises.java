package c08_oop;

import java.util.ArrayList;

public class ClassesExercises {

    public static void main(String[]args) {

        // 1. Crea una clase Book con atributos title y author. C
        Book book1 = new Book();
        book1.title = "La nausea";
        book1.author = "Jean Paul Sartre";
        book1.showBook();

        // 2. Crea una clase Dog con
        Dog dog1 = new Dog();
        dog1.nameDog = "Dante";
        dog1.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.

            //public Book(String title, String author) {
            // this.title = title;
            // this.author = author;


        // 4. Crea una clase Car con atributos brand y model y un método showData().

        Car car1 = new Car();
        car1.brand = "Kia";
        car1.model = "Rio EX";
        car1.showData();



        // 5. Crea una clase Student con atributo score y un método que diga si aprobó
        // (mayor o igual a 60).

        Student student1 = new Student();
        student1.approved(59);

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que
        // sume el saldo.

        BankAccount account1 = new BankAccount();
        account1.balance = 0;
        account1.deposit(1000);




        // 7. Crea una clase Rectangle con métodos para calcular el Área y el perímetro.
        Rectangle areaRectangle = new Rectangle();
        // areaRectangle.area = 0;
        areaRectangle.area(18, 12);

        Rectangle perimeterRectangle = new Rectangle();
        // perimeterRectangle.perimetro = 0;
        perimeterRectangle.perimetro(18, 12);


        // 8. Crea una clase Worker que reciba nombre y salario, y un método para
        // mostrar su salario.

        Worker employee1 = new Worker("Fabian Ramirez", 3500000);
        employee1.showEmployee();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Mariana", 2));
        people.add(new Person("Alexandra", 23));
        people.add( new Person("Isabel", 62));
        people.add( new Person("Andres", 43));

        System.out.println("Registro de personas");
        for (Person person : people) {
            person.sayHello();
        }


        // 10. Crea una clase Product y un método que aplique un descuento sobre su
        // precio.

        Product product1 = new Product("MagicMouse", 450000);
        product1.showPrice();
        product1.productDiscount(10);
        product1.showPrice();
    }

    }

