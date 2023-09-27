package src.shortJavaTasks;

//Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
//        For numbers which are multiples of both three and five return 'FizzBuzz'.
//        For numbers that are neither, return the input number.
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(150));
        System.out.println(fizzBuzz(12));
        System.out.println(fizzBuzz(10));
        System.out.println(fizzBuzz(11));
    }

    public static String fizzBuzz(Integer i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        }
        return i.toString();
    }
}
