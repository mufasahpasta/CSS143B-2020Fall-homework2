package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        super(rating, title);
        // homework
        // tip: use the 'super' keyword
        super.rating = rating;
        super.title = title;
    }

    public MovieAction(MovieAction anotherMovie) {
        // homework
        // tip: use the 'super' keyword
        super(anotherMovie);

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
        else if(numOfDaysPastDue < 5)
        {
            return numOfDaysPastDue * lateFeePerDayInDollar;
        }
        else
        {
            return 2 * numOfDaysPastDue * lateFeePerDayInDollar;
        }
    }
}
