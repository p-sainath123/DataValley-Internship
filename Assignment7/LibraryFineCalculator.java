import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of days late
        System.out.print("Enter the number of days the book is late: ");
        int daysLate = scanner.nextInt();

        // Calculate fine based on the number of days late
        double fine = 0;

        if (daysLate <= 7) {
            fine = daysLate * 0.5; // 50 paise fine per day
        } else if (daysLate <= 14) {
            fine = 7 * 0.5 + (daysLate - 7) * 1; // 50 paise for first 7 days, 1 rupee thereafter
        } else if (daysLate <= 21) {
            fine = 7 * 0.5 + 7 * 1 + (daysLate - 14) * 5; // 50 paise for first 7 days, 1 rupee for next 7 days, 5 rupees thereafter
        } else {
            System.out.println("Your membership is canceled due to returning the book after 21 days.");
            System.exit(0);
        }

        // Output fine amount
        System.out.println("Fine: Rs. " + fine);

        scanner.close();
    }
}
