public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        var sum = a + b;
        System.out.println("""
                The sum of %d and %d is: %d
                """.formatted(a, b, sum)); // String formatting with %d
    }
}
