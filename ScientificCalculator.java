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
    public static double addition(double num1, double num2) { return num1 + num2; }
    private static void performAddition(Scanner scan) {
        try {
            System.out.println("Enter First Number: ");
            double num1 = scan.nextDouble();
            System.out.println("Enter Second Number: ");
            double num2 = scan.nextDouble();
            System.out.println(addition(num1, num2));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }
     public static double subtract(double num1, double num2) { return num1 - num2; }
     private static void performSubtraction(Scanner scan) {
        try {
            System.out.println("Enter First Number: ");
            double num1 = scan.nextDouble();
            System.out.println("Enter Second Number: ");
            double num2 = scan.nextDouble();
            System.out.println(subtract(num1, num2));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }
    public static double multiply(double num1, double num2) { return num1 * num2; }
    private static void performMultiplication(Scanner scan) {
        try {
            System.out.println("Enter First Number: ");
            double num1 = scan.nextDouble();
            System.out.println("Enter Second Number: ");
            double num2 = scan.nextDouble();
            System.out.println(multiply(num1, num2));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }
    public static double divide(double num1, double num2) { return num1 / num2; }
    private static void performDivision(Scanner scan) {
        try {
            System.out.println("Enter First Number: ");
            double num1 = scan.nextDouble();
            System.out.println("Enter Second Number: ");
            double num2 = scan.nextDouble();
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                System.out.println(divide(num1, num2));
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }
    public static double calculateSquareRoot(double num) { return Math.sqrt(num); }
    private static void performSqrt(Scanner scan) {
        try {
            System.out.println("Enter Number: ");
            double num1 = scan.nextDouble();
            if (num1 < 0) {
                System.out.println("Error: Cannot calculate square root of a negative number.");
            } else {
                System.out.println(calculateSquareRoot(num1));
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }
    public static double calculatePower(double base, double exponent) { return Math.pow(base, exponent); }
    private static void performPower(Scanner scan) {
        try {
            System.out.println("Enter Base: ");
            double base = scan.nextDouble();
            System.out.println("Enter Exponent: ");
            double exponent = scan.nextDouble();
            System.out.println(calculatePower(base, exponent));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }
    public static double calculateSine(double degrees) { return Math.sin(Math.toRadians(degrees)); }
    public static double calculateCosine(double degrees) { return Math.cos(Math.toRadians(degrees)); }
    public static double calculateTangent(double degrees) { return Math.tan(Math.toRadians(degrees)); }
    private static void performSine(Scanner scan) {
        try {
            System.out.println("Enter Degree: ");
            double num = scan.nextDouble();
            System.out.println(calculateSine(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }

    private static void performCosine(Scanner scan) {
        try {
            System.out.println("Enter Degree: ");
            double num = scan.nextDouble();
            System.out.println(calculateCosine(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }

    private static void performTangent(Scanner scan) {
        try {
            System.out.println("Enter Degree: ");
            double num = scan.nextDouble();
            double normalizedDegrees = num % 360;
            if (normalizedDegrees < 0) normalizedDegrees += 360;
            if (normalizedDegrees % 180 == 90) {
                System.out.println("Error: Tangent is undefined at " + num + "°.");
            } else {
                System.out.println(calculateTangent(num));
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }
    public static double calcNaturalLogarithm(double num) { return Math.log(num); }
    public static double calcLogarithmBase10(double num) { return Math.log10(num); }
    private static void performNaturalLog(Scanner scan) {
        try {
            System.out.println("Enter Number: ");
            double num = scan.nextDouble();
            if (num <= 0) {
                System.out.println("Error: Undefined for zero or negative numbers.");
            } else {
                System.out.println(calcNaturalLogarithm(num));
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }
    private static void performLog10(Scanner scan) {
        try {
            System.out.println("Enter Number: ");
            double num = scan.nextDouble();
            if (num <= 0) {
                System.out.println("Error: Undefined for zero or negative numbers.");
            } else {
                System.out.println(calcLogarithmBase10(num));
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }
    public static double absoluteValue(double num) { return Math.abs(num); }
    public static double roundNumber(double num) { return Math.round(num); }
    public static double ceilingNumber(double num) { return Math.ceil(num); }
    public static double floorNumber(double num) { return Math.floor(num); }
    private static void performAbsolute(Scanner scan) {
        try {
            System.out.println("Enter Number: ");
            double num = scan.nextDouble();
            System.out.println(absoluteValue(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }

    private static void performRound(Scanner scan) {
        try {
            System.out.println("Enter Number: ");
            double num = scan.nextDouble();
            System.out.println(roundNumber(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }

    private static void performCeiling(Scanner scan) {
        try {
            System.out.println("Enter Number: ");
            double num = scan.nextDouble();
            System.out.println(ceilingNumber(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }

    private static void performFloor(Scanner scan) {
        try {
            System.out.println("Enter Number: ");
            double num = scan.nextDouble();
            System.out.println(floorNumber(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }
    public static double findMin(double num1, double num2) { return Math.min(num1, num2); }
    public static double findMax(double num1, double num2) { return Math.max(num1, num2); }
    private static void performMinimum(Scanner scan) {
        try {
            System.out.println("Enter First Number: ");
            double num1 = scan.nextDouble();
            System.out.println("Enter Second Number: ");
            double num2 = scan.nextDouble();
            System.out.println(findMin(num1, num2));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }

    private static void performMaximum(Scanner scan) {
        try {
            System.out.println("Enter First Number: ");
            double num1 = scan.nextDouble();
            System.out.println("Enter Second Number: ");
            double num2 = scan.nextDouble();
            System.out.println(findMax(num1, num2));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }

}
