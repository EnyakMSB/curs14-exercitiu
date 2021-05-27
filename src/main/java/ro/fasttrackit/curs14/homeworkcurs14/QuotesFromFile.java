package ro.fasttrackit.curs14.homeworkcurs14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class QuotesFromFile {

    public static void main(String[] args) throws Exception {
        List<Quotes> quote = readFromFile();
        quote.forEach(System.out::println);
    }

    public static List<Quotes> readFromFile() throws Exception {
        List<Quotes> quotes = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader("src/main/resources/quotes.txt"));
        String line;
        int id = 1;
        while ((line = fileReader.readLine()) != null) {
            quotes.add(readQuotes(id++, line));
        }
        return quotes;
    }

    private static Quotes readQuotes(int id, String quotesInfo) {
        String[] quotesData = quotesInfo.split("~");
        String author = quotesData[0];
        String quote = quotesData[1];
        return new Quotes(id, author, quote);
    }
}
