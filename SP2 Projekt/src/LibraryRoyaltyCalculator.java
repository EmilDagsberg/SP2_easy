public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        Author a1 = new Author("Haruki Murakami");
        a1.addTitle(new PrintedBook("Kafka on the Shore", "SKØN", 500, 400));
        a1.addTitle(new AudioBook("Norwegian Woord", "BI", 100, 500));
        a1.addTitle(new PrintedBook("1Q84", "SKØN", 250, 1000));

        // String.format forces the calculateTotalPay() down to two decimals.
        System.out.println("Haruki Murakami: " + String.format("%.2f", a1.calculateTotalPay()) + " kr");

        Author a2 = new Author("Tatsuki Fujimoto");
        a2.addTitle(new PrintedBook("Chainsaw Man", "TE", 350, 150));
        a2.addTitle(new PrintedBook("Fire Punch", "TE", 50, 200));
        a2.addTitle(new AudioBook("Goodbye, Eri", "FAG", 75, 60));

        System.out.println("Tatsuki Fujimoto: " + String.format("%.2f", a2.calculateTotalPay()) + " kr");

    }
}
