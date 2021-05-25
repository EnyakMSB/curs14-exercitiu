package ro.fasttrackit.curs14.homeworkcurs14;

import java.util.Objects;

public class Quotes {
    private final int id;
    private final String author;
    private final String quote;
    private boolean favourite;

    public Quotes(int id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
        this.favourite = false;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                ", favourite=" + favourite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quotes quotes = (Quotes) o;
        return id == quotes.id && favourite == quotes.favourite && Objects.equals(author, quotes.author) && Objects.equals(quote, quotes.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, quote, favourite);
    }
}
