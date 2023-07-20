public class PrimeNumbers {
    public static void main(String[] args) {
        int number = 2;

        System.out.println("Prime numbers between 0 and 100:");
        while (number <= 100) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
            number++;
        }
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        // Check if the number is divisible by any number from 2 to its square root
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
}
        return true;
    }
}



