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
        if(super.getLiteratureType().equals("BI") || super.getLiteratureType().equals("TE") ) {
            return 3.00;
        } else if (super.getLiteratureType().equals("LYRIK")) {
            return 6.00;
        } else if(super.getLiteratureType().equals("SKØN")) {
            return 1.70;
        } else {
            return 1.00;
        }
    }
}
