public class PrintedBook extends Title {
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    protected double calculatePoints() {
        return pages * calculateLiteraturePoints() * super.copies;
    }

    protected double calculateLiteraturePoints() {
        return switch (super.getLiteratureType()) {
            case "BI", "TE" -> 3.00;
            case "LYRIK" -> 6.00;
            case "SKØN" -> 1.70;
            case "FAG" -> 1.00;
            default -> 0.00;
        };
    }
}
