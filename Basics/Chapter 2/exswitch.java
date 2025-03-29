public class exswitch{ // Renamed class
    public static void main(String[] args) { // Fixed main method syntax
        int n = 1;

        switch (n) { 
            case 1 -> System.out.println("Monday");
            // Prevents fall-through
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day number"); // Handles cases outside 1-7
        }
    }
}
