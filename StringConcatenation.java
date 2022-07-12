import java.util.*;

class Authority {
    public static void main(String[] args) {
        String firstName; // holds string objects
        String lastName;

        Scanner keyboard = new Scanner (System.in); // create scanner object
        System.out.print("Inmate's name: "); // user input prompt
        firstName = keyboard.nextLine();
        System.out.print("Inmate's father's name: ");
        lastName = keyboard.nextLine();

        if (firstName.matches("[A-Za-z\\s]+") && lastName.matches(("[A-Za-z\\s]+"))) {
            System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase());
        } else if (!firstName.matches("[A-Za-z\\s]+")) {
            System.out.println("Invalid name");
        } else if (!lastName.matches(("[A-Za-z\\s]+"))) {
            System.out.println("Invalid name");
        }
    }
}
