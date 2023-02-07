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

    // Ask a user for a number, and alert all the powers of 2 that are less than that number. For example, if 50 is entered, your program should print 1, 2, 4, 8, 16 and 32 to the console.
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

    }

    static void whileSix() {

    }

    static void whileEight() {

    }
}