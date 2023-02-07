import java.util.Scanner;
public class Main {
    // I have prefixed the solutions with their corresponding assignment and question number
    public static void main(String[] args) {
        whileFour();
    }
    static void whileTwo() {
        int counter = 0;
        do {
            System.out.println(counter);
            counter += 3;
        } while (counter <= 21);
    }
    static void forTwo() {
        for (int i = 0; i <= 21; i += 3)
            System.out.println(i);
    }
    static void whileFour() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(scan.nextLine().trim());

        int counter = 1;
        while (counter < num) {
            System.out.println(counter);
            counter *= 2;
        }
    }
    static void forFour() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(scan.nextLine().trim());

        for (int i = 1; i < num; i *= 2)
            System.out.println(i);
    }
    static void whileSix() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Are you able to drive? (y/n): ");

            char answer = scan.nextLine().trim().charAt(0);

            if (answer == 'y' || answer == 'n') {
                System.out.println("Thank you for your input!");
                return;
            }
        }
    }
    static void whileEight() {
        Scanner scan = new Scanner(System.in);

        int total = 0;
        int counter = 0;
        int input = 0;

        do {
            System.out.print(">> ");
            input = Integer.parseInt(scan.nextLine().trim());

            total += input;
            counter++;
        } while (input > 0);

        System.out.println("Total: " + total);
        System.out.println("Average: " + total / counter);
    }
}