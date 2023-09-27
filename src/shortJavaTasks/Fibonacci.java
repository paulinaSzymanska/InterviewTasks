package src.shortJavaTasks;

//Write a method that returns the nth element of the Fibonacci Sequence
//        The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
//        The next number is found by adding up the two numbers before it.
//        Assume that indexes start at zero, e.g., fib(0) = 0, fib(1) = 1, ...
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(11));
        System.out.println(fibonacci(17));
    }
    public static Integer fibonacci(Integer n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return (fibonacci(n-1) + fibonacci(n-2));
        }
    }
}
