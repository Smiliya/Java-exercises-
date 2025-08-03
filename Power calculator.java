public class PowerCalculator {
    public static void main(String[] args) {
        int base = 2, exponent = 3;
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }
}
output:
   Result: 8
