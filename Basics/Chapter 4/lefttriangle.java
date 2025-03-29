public class lefttriangle { // Corrected class name
    public static void main(String[] args) { // Fixed main method
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print stars on the same line
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

