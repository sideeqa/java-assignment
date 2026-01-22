//count number of odd/ even number
//countr positive and negative number
//sum the number that can be divided by both 3 and 5

//eg: prompt user to enter number o

public class OddEvenRange {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
   }
}


    Even number → number % 2 == 0

    Odd number → number % 2 != 0
    Counts positive numbers
    Counts negative numbers
    Sums numbers divisible by both 3 and 5
    Stops input when the user enters 0
Java Program













import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int sumDivisibleBy3And5 = 0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int number = input.nextInt();

            if (number == 0) {
                break; // stop input
            }

            if (number > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }

            if (number % 3 == 0 && number % 5 == 0) {
                sumDivisibleBy3And5 += number;
            }
        }

        System.out.println("\nResults:");
        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Sum of numbers divisible by both 3 and 5: " + sumDivisibleBy3And5);
    }
}

How it works (simple explanation)

    while(true) → keeps asking for numbers

    0 → sentinel value (used to stop input)

    number > 0 → positive

    number < 0 → negative

    number % 3 == 0 && number % 5 == 0 → divisible by both 3 and 5

