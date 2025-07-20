import java.util.InputMismatchException;
import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        do {
            displayMenu();
            System.out.println("Enter choice: ");
            try {
                choice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice input.");
                scan.next();
                continue;
            }

            switch (choice) {
                case 1: performAddition(scan); break;
                case 2: performSubtraction(scan); break;
                case 3: performMultiplication(scan); break;
                case 4: performDivision(scan); break;
                case 5: performSqrt(scan); break;
                case 6: performPower(scan); break;
                case 7: performSine(scan); break;
                case 8: performCosine(scan); break;
                case 9: performTangent(scan); break;
                case 10: performNaturalLog(scan); break;
                case 11: performLog10(scan); break;
                case 12: performAbsolute(scan); break;
                case 13: performRound(scan); break;
                case 14: performCeiling(scan); break;
                case 15: performFloor(scan); break;
                case 16: performMinimum(scan); break;
                case 17: performMaximum(scan); break;
                case 0: System.out.println("Exiting calculator."); break;
                default: System.out.println("Invalid choice. Please try again."); break;
            }
        } while (choice != 0);
    }
    private static void displayMenu() {
        System.out.println("\n--- Scientific Calculator ---");
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Square Root\n6.Power\n7.Sine\n8.Cosine\n9.Tangent\n10.Natural Logarithm\n11.Logarithm Base10\n12.Absolute Value\n13.Round\n14.Ceiling\n15.Floor\n16.Min of two numbers\n17.Max of two numbers\n0.Exit");
    }
}
