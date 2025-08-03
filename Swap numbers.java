public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

output:
a = 10  
b = 5
