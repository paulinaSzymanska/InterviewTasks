package src.shortJavaTasks;

import java.util.Random;

// Create a method called printRandomNumbers that generates two random numbers and prints their sum as the result.
public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println(printRandomNumbers(111));
    }

    private static String printRandomNumbers(Integer number) {
        Random random = new Random();
        int firstNumber = random.nextInt(number);
        int secondNumber = number - firstNumber;
        return """
                %d + %d = %d""".formatted(firstNumber, secondNumber, number);
    }
}
