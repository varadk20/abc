public class Sum {
    public static void main(String[] args) {
        // Read numbers from environment variables
        int a = Integer.parseInt(System.getenv("a"));
        int b = Integer.parseInt(System.getenv("b"));
        String fname= System.getenv("fname");

        // It will return the sum of two arguments.
        System.out.println("The sum is = " + Integer.sum(a, b));
        System.out.println("This is name: " +fname);
    }
}
