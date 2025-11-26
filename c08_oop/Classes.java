package c08_oop;

public class Classes {

    public  static void main(String[] args) {

        var person = new Person("Hector", 42);

        person.name = "Mariana";
        person.age = 2;

        person.sayHello();

        person.name = "Hector Varon";
        System.out.println(person.name);

        var person2 = new Person("Fabian", 19);
        person2.sayHello();
    }
}
