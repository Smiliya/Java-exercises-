void main() {
    int num = 28, sum = 0;
    for (int i = 1; i < num; i++) {
        if (num % i == 0) sum += i;
    }
    System.out.println(num + (sum == num ? " is a perfect number." : " is not a perfect number."));
}

output:
    28 is a perfect number.
