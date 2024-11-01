public class AudioBook extends Title {
    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    protected double calculatePoints() {
        return (durationInMinutes * 0.5) * calculateLiteraturePoints() * super.copies;
    }

    protected double calculateLiteraturePoints() {
        return switch (super.getLiteratureType()) {
            case "BI", "TE" -> 1.50;
            case "LYRIK" -> 3.00;
            case "SKØN" -> 0.85;
            case "FAG" -> 0.50;
            default -> 0.00;
        };
    }
}
