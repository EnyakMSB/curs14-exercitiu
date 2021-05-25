package ro.fasttrackit.curs14.maven;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Usual JAVA");

        String ascii= FigletFont.convertOneLine("HELLO MAVEN !");
        System.out.println(ascii);
    }
}
