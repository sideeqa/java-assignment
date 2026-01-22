import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualRate = input.nextDouble();

        System.out.print("Enter loan period (years): ");
        int years = input.nextInt();

        double monthlyRate = annualRate / 100 / 12;
        int numberOfMonths = years * 12;

        double monthlyPayment = loanAmount *
                (monthlyRate * Math.pow(1 + monthlyRate, numberOfMonths)) /
                (Math.pow(1 + monthlyRate, numberOfMonths) - 1);

        System.out.printf("Monthly Mortgage Payment: ₦%.2f%n", monthlyPayment);

        input.close();
    }
}

