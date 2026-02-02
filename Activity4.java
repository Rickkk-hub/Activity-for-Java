package Activity;
import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n-- Menu --");
            System.out.println("1. Check grades");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            choice = scan.nextInt();

            switch (choice) {

                case 1: {
                    int[] grades = new int[5];
                    int total = 0;

                    for (int i = 0; i < 5; i++) {
                        while (true) {
                            System.out.print("Enter grade: ");
                            System.out.println();
                            int g = scan.nextInt();

                            if (g < 0 || g > 100) {
                                System.out.println("Invalid grade! Try again.");
                            } else {
                                grades[i] = g;
                                break;
                            }
                        }
                    }

                    for (int g : grades) {
                        total += g;
                    }

                    double average = total / 5.0;
                    System.out.println();
                    System.out.println("Average: " + average);

                    if (average >= 90) {
                        System.out.println("Excellent");
                    } else if (average >= 80) {
                        System.out.println("Very Good");
                    } else if (average >= 70) {
                        System.out.println("Good");
                    } else if (average >= 60) {
                        System.out.println("Fair");
                    } else {
                        System.out.println("Failed");
                    }
                    break;
                }

                case 2:
                    System.out.println("Exiting the Program!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 2);

        scan.close();
    }
}
