public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        // Using var for local variable type inference (introduced in JDK 10)
        var sum = a + b;

        // Using text blocks (introduced in JDK 13) for better formatting and cleaner code
        System.out.println("""
                The sum of %d and %d is: %d
                """.formatted(a, b, sum)); // Formatted string for output
    }
}
