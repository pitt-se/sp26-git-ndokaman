public class CommitCafe {

    private static String barista = "Henry"; // STUDENT_TODO_1A: Change name

    // STUDENT_TODO_1B: Add a nickname or title for the barista

    private static String nickname = "CoffeeMan";

    private static int cups = 0;

    public static void brew(String drink) {
        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message

        int newCup = cups + 1;
        System.out.print("Added 1 to cup");

        // STUDENT_TODO_2B: Add a second brew-related improvement

        String sugar = "sugar";
        String addedSugger = drink + sugar;

    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}

// sorry for the bad code haha