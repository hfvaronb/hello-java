public class Conditionals  {
    public static void main (String [] args) {

        // Condicionales

//        if, else, else if

        var age = 18;
        System.out.println(age >= 18);

        if( age > 18) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("El usuario acaba de cumplir 18");
        }
        else {
            System.out.println("El usuario es menor de edad");
        }

        // Switch

        var day = 5;
        switch (day) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            default:
                System.out.println("No es ni lunes, martes o miercoles ");
        }
    }
}
