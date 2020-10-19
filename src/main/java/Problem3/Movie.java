package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        id = UUID.randomUUID();
        // homework
        this.rating = rating;
        this.title = title;
    }

    public Movie(Movie anotherMovie) {
        // homework
        rating = anotherMovie.rating;
        title = anotherMovie.title;
        id = anotherMovie.id;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        if(obj != null && getClass() == obj.getClass()) // https://help.semmle.com/wiki/display/JAVA/Inherited+equals%28%29+in+subclass+with+added+fields
        {
            Movie m = (Movie) obj;
            return this.id.equals(m.id);
        }
        return false;
    }
}
