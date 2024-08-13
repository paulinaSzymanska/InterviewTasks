package src.java.codeWars.easy;

import java.util.List;

//A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
//        Write a method that checks if a number is a prime number.
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(79));
        System.out.println(isPrime(-11));
        System.out.println(isPrime(7));
        System.out.println(isPrime(13));
        System.out.println(isPrime(101));
        System.out.println(isPrime(10301));
    }

    public static boolean isPrime(int n) {
        List<Integer> integers = List.of(2, 3, 5, 7, 9, 11);
        boolean anyMatch = integers.stream().anyMatch(number -> n % number == 0);

        if (n <= 1) {
            return false;
        } else if (integers.contains(n)) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else return !anyMatch;
    }
}
