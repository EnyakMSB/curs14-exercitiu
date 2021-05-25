package ro.fasttrackit.curs14.homeworkcurs14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteService {

    public List<Quotes> quotesList;

    public QuoteService(List<Quotes> quotesList) {
        this.quotesList = new ArrayList<>();
        this.quotesList.addAll(quotesList);
    }

    public List<String> getAllQuotes() {
        List<String> result = new ArrayList<>();
        for (Quotes quote : quotesList) {
            result.add(quote.getQuote());
        }
        return result;
    }

    public List<Quotes> getQuotesForAuthor(String author) {
        List<Quotes> result = new ArrayList<>();
        for (Quotes quote : quotesList) {
            if (quote.getAuthor().equals(author)) {
                result.add(quote);
            }
        }
        return result;
    }

    public List<String> getAuthors() {
        List<String> result = new ArrayList<>();
        for (Quotes quote : quotesList) {
            result.add(quote.getAuthor());
        }
        return result;
    }

    public void setFavourite(int id) {
        for (Quotes quote : quotesList) {
            if (quote.getId() == id) {
                quote.setFavourite(true);
            }
        }
    }

    public List<Quotes> getFavouriteList(){
        List<Quotes> result = new ArrayList<>();
        for(Quotes quote:quotesList){
            if(quote.isFavourite()){
                result.add(quote);
            }
        }
        return result;
    }

    public String getRandomQuote(){
        String result=null;
        Random random=new Random();
        int randomValue=random.nextInt(46);
        for(Quotes quote:quotesList){
            if(randomValue ==quote.getId()){
                result = randomValue + " ~ " + quote.getQuote();
            }
        }
        return  result;
    }
}
