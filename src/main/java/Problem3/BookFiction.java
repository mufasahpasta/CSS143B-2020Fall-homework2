package Problem3;

public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        super(title, author);
        // homework
        // tip: use the 'super' keyword
        this.genres = genres;
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        super(anotherBook);
        // homework
        // tip: use the 'super' keyword
        genres = anotherBook.genres;
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        if(numOfDaysPastDue <= 0)
        {
            return 0;
        }
        else if(numOfDaysPastDue > 0)
        {
            return numOfDaysPastDue * lateFeePerDayInDollar;
        }
        return 0;
    }
}
