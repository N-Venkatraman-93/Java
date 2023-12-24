package question_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Sample array of numbers 1 to 5
        int[] numbers = {1, 2, 3, 4, 5};

        int sumOfSquaredOddNumbers = Arrays.stream(numbers)
                .filter(num -> num % 2 != 0)  // filter odd numbers
                .map(num -> num * num)        // square the numbers
                .sum();                        // find the sum

        System.out.println(sumOfSquaredOddNumbers);
    }
}


