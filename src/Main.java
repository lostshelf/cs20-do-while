public class Main {
    // I have prefixed the solutions with their corresponding assignment and question number
    public static void main(String[] args) {
        while_two();
    }

    static void while_two() {
        int counter = 0;
        do {
            System.out.println(counter);
            counter += 3;
        } while (counter <= 21);
    }
}