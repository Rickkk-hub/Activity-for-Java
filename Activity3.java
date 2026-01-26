package Activity;
import java.util.Scanner;

public class Activity3 {

 
	public static int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }
    
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtract");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            
            
            System.out.println();
            System.out.print("Enter choice: ");
            
            int choice = scan.nextInt();

            if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice!");
                continue;
            }
             
            String operationName = "";
            
            System.out.print("Enter 1st number: ");
            int num1 = scan.nextInt();

            System.out.print("Enter 2nd number: ");
            int num2 = scan.nextInt();

            int result = 0;

            switch (choice) {
                case 1 -> {
                	result = Addition(num1, num2);
                    operationName = "Addition: ";
                }
                case 2 -> {
                	result = Subtraction(num1, num2);
                	operationName = "Subration: ";
                }
                case 3 -> {
                	result = Multiplication(num1, num2);
                	operationName = "Multiplication: ";
                }
            }
            System.out.println();
            System.out.println(operationName);
            System.out.println("Result: " + result);
        }

        scan.close();
    }
}
