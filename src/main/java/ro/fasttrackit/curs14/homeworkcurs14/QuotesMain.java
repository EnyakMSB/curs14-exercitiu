package ro.fasttrackit.curs14.homeworkcurs14;

import static ro.fasttrackit.curs14.homeworkcurs14.QuotesFromFile.readFromFile;

public class QuotesMain {
    public static void main(String[] args) throws Exception{
        QuoteService quotesList = new QuoteService(readFromFile());

        System.out.println(quotesList.getAllQuotes());
        System.out.println("---");
        System.out.println(quotesList.getQuotesForAuthor("Brian Tracy"));
        System.out.println("***");
        System.out.println("Authors List : " + quotesList.getAuthors());
        quotesList.setFavourite(11);
        System.out.println("Favourite list : " + quotesList.getFavouriteList());
        System.out.println("@ @ @");
        System.out.println(quotesList.getRandomQuote());
    }
}
