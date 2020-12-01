package com.andrii;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class Application {
    public static final Path FILE_PATH = Paths.get("/Users/andriylehedza/Desktop/javabootcamp/Text counter/src/main/java/com/andrii/song.txt");


    public static void main(String[] args) throws IOException, URISyntaxException {
        Reader reader = new Reader();
        List<String> wordList = reader.readFile();
        System.out.println("List of words after used sorting method : " + reader.arraySorting(wordList));
        List<String> arrayAfterSorting = reader.arraySorting(wordList);
        List<String> arrayWithSmallWords = reader.filterWords(wordList, 3);
        System.out.println("Number of small words is: " + arrayWithSmallWords.size());
        System.out.println("List of words with forbidden words and words less than 3 characters after used sorting method : " + reader.filterWords(wordList, 3));
        final Map<String, Integer> wordMap = reader.createWordMap(arrayAfterSorting);
        final String mostRepeatedWord = reader.findMostRepeatedWord(wordMap);
        System.out.println("The most repeated word in our file is : " + mostRepeatedWord);
        System.out.println("The number of words in file is: " + wordList.size());
    }
}
