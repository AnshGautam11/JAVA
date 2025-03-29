import java.util.Scanner; // Import Scanner for user input

public class table { // Renamed class name to PascalCase
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a number to print its table: ");
        int num = sc.nextInt(); // Read user input

        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) { // Fixed loop condition
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close(); // Close scanner to avoid memory leaks
    }
}
