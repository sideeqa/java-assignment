public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for total bill
        System.out.print("Enter total bill amount: ");
        double totalBill = scanner.nextDouble();

        // Ask if user is a member
        System.out.print("Are you a member? (yes/no): ");
        String Member = scanner.next();

        double discount = 0.0;

        // Check discount eligibility
        if (totalBill >= 1000) {
            if (isMember.equalsIgnoreCase("yes")) {
                discount = totalBill * 0.10; // 10% discount
                System.out.println("You are a member. You get 10% off!");
            } else {
                discount = totalBill * 0.05; // 5% discount
                System.out.println("You are not a member. You get 5% off!");
            }
        } else {
            System.out.println("No discount available for your bill.");
        }

        // Calculate final amount
        double finalAmount = totalBill - discount;
        System.out.println("Final amount to pay: " + finalAmount);

        

