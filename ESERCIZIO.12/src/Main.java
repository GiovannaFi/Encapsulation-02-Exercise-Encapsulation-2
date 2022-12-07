import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person person1 = new Person();

        System.out.println("Insert your name:");
        person1.setName(scanner.nextLine());

        System.out.println("Insert your surname:");
        person1.setSurname(scanner.nextLine());

        System.out.println("Insert your height:");
        person1.setHeight(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Insert your age:");
        person1.setAge(Integer.parseInt(scanner.nextLine()));

        System.out.println("Hello " + person1.getName() + " " + person1.getSurname());
        System.out.println("Your height: " + String.format("%.2f",person1.getHeight()) + ", your age: " + person1.getAge());


        /* private String name;
        private String surname;
        private double height;
        private int age;*/

    }
}