package probleam1;

public class InfoNumber {

    static void findDivisor(int number) {
        System.out.println("The divisors of the number " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                int divisor = number / i;
                System.out.print(divisor + " ");
            }
        }
    }

    static boolean primeNumber(int number) {
        System.out.println("The number " + number + " is a prime number - ");
        boolean primeNumber;
        int d = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { d++; }
        }
        if (d > 2) {primeNumber = false; } else { primeNumber = true; }
        return primeNumber;
    }
}
