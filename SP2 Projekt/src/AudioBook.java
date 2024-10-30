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
        if (super.getLiteratureType().equals("BI") || super.getLiteratureType().equals("TE")) {
            return 1.50;
        } else if (super.getLiteratureType().equals("LYRIK")) {
            return 3.00;
        } else if (super.getLiteratureType().equals("SKØN")) {
            return 0.85;
        } else {
            return 0.50;
        }
    }
}
