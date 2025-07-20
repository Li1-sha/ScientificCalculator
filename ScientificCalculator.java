import java.util.Scanner;  
import java.util.InputMismatchException;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
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

    public static double addition(double num1, double num2) { return num1 + num2; }
    public static double subtract(double num1, double num2) { return num1 - num2; }
    public static double multiply(double num1, double num2) { return num1 * num2; }
    public static double divide(double num1, double num2) { return num1 / num2; }
    public static double calculateSquareRoot(double num) { return Math.sqrt(num); }
    public static double calculatePower(double base, double exponent) { return Math.pow(base, exponent); }
    public static double calculateCosine(double degrees) { return Math.cos(Math.toRadians(degrees)); }
    public static double calculateSine(double degrees) { return Math.sin(Math.toRadians(degrees)); }
    public static double calculateTangent(double degrees) { return Math.tan(Math.toRadians(degrees)); }
    public static double calcNaturalLogarithm(double num) { return Math.log(num); }
    public static double calcLogarithmBase10(double num) { return Math.log10(num); }
    public static double absoluteValue(double num) { return Math.abs(num); }
    public static double roundNumber(double num) { return Math.round(num); }
    public static double ceilingNumber(double num) { return Math.ceil(num); }
    public static double floorNumber(double num) { return Math.floor(num); }
    public static double findMin(double num1, double num2) { return Math.min(num1, num2); }
    public static double findMax(double num1, double num2) { return Math.max(num1, num2); }

    public static void displayMenu() {
        System.out.println("Scientific Calculator:\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Square Root\n6.Power\n7.Sine\n8.Cosine\n9.Tangent\n10.Natural Logarithm\n11.Logarithm Base10\n12.Absolute Value\n13.Round\n14.Ceiling\n15.Floor\n16.Min of two numbers\n17.Max of two numbers\n0.Exit");
    }

    private static void performAddition(Scanner scan) { performTwoNumberOp(scan, "Add", ScientificCalculator::addition); }
    private static void performSubtraction(Scanner scan) { performTwoNumberOp(scan, "Subtract", ScientificCalculator::subtract); }
    private static void performMultiplication(Scanner scan) { performTwoNumberOp(scan, "Multiply", ScientificCalculator::multiply); }

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

    private static void performPower(Scanner scan) { performTwoNumberOp(scan, "Power", ScientificCalculator::calculatePower); }

    private static void performSine(Scanner scan) { performOneNumberOp(scan, "Sine", ScientificCalculator::calculateSine); }
    private static void performCosine(Scanner scan) { performOneNumberOp(scan, "Cosine", ScientificCalculator::calculateCosine); }

    private static void performTangent(Scanner scan) {
        try {
            System.out.println("Enter Degree: ");
            double num1 = scan.nextDouble();
            double normalizedDegrees = num1 % 360;
            if (normalizedDegrees < 0) normalizedDegrees += 360;
            if (normalizedDegrees % 180 == 90) {
                System.out.println("Error: Tangent is undefined at " + num1 + "°.");
            } else {
                System.out.println(calculateTangent(num1));
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }

    private static void performNaturalLog(Scanner scan) {
        try {
            System.out.println("Enter Number: ");
            double num1 = scan.nextDouble();
            if (num1 <= 0) {
                System.out.println("Error: Undefined for zero or negative numbers.");
            } else {
                System.out.println(calcNaturalLogarithm(num1));
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }

    private static void performLog10(Scanner scan) {
        try {
            System.out.println("Enter Number: ");
            double num1 = scan.nextDouble();
            if (num1 <= 0) {
                System.out.println("Error: Undefined for zero or negative numbers.");
            } else {
                System.out.println(calcLogarithmBase10(num1));
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }

    private static void performAbsolute(Scanner scan) { performOneNumberOp(scan, "Absolute", ScientificCalculator::absoluteValue); }
    private static void performRound(Scanner scan) { performOneNumberOp(scan, "Round", ScientificCalculator::roundNumber); }
    private static void performCeiling(Scanner scan) { performOneNumberOp(scan, "Ceiling", ScientificCalculator::ceilingNumber); }
    private static void performFloor(Scanner scan) { performOneNumberOp(scan, "Floor", ScientificCalculator::floorNumber); }
    private static void performMinimum(Scanner scan) { performTwoNumberOp(scan, "Minimum", ScientificCalculator::findMin); }
    private static void performMaximum(Scanner scan) { performTwoNumberOp(scan, "Maximum", ScientificCalculator::findMax); }

   
    private static void performOneNumberOp(Scanner scan, String opName, java.util.function.DoubleUnaryOperator op) {
        try {
            System.out.println("Enter Number: ");
            double num = scan.nextDouble();
            System.out.println(op.applyAsDouble(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }

    private static void performTwoNumberOp(Scanner scan, String opName, java.util.function.DoubleBinaryOperator op) {
        try {
            System.out.println("Enter First Number: ");
            double num1 = scan.nextDouble();
            System.out.println("Enter Second Number: ");
            double num2 = scan.nextDouble();
            System.out.println(op.applyAsDouble(num1, num2));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
            scan.next();
        }
    }
}

