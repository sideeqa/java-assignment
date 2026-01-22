import java.util.Scanner;

public class CreditCardValidator {

    public static boolean isValidCard(String cardNumber) {
        int sum = 0;
        boolean alternate = false;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = cardNumber.charAt(i) - '0';

            if (alternate) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }

            sum += digit;
            alternate = !alternate;
        }

        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter credit card number: ");
        String cardNumber = input.nextLine();

        if (isValidCard(cardNumber)) {
            System.out.println("Credit card number is VALID ");
        } else {
            System.out.println("Credit card number is INVALID");
        }

        
    }
}

