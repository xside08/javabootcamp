package com.andrii;

import java.io.IOException;
import java.util.*;

public class Reader {
    public static final List<String> FORBIDDEN_WORDS = Arrays.asList("fuck", "asshole");
    public static final int MIN_WORD_LENGTH = 3;

    Scanner scanner = new Scanner(Application.FILE_PATH);

    public Reader() throws IOException {
    }

    public List<String> readFile() {
        List<String> words = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] wordsArr = line.split("\\W");
            Collections.addAll(words, wordsArr);
        }
        return words;
    }

    public List<String> arraySorting(List<String> arrayToCheck) {
        List<String> arrayAfterSorting = new ArrayList<>();
        for (String word : arrayToCheck) {
            if (word.length() > MIN_WORD_LENGTH) {
                if (!FORBIDDEN_WORDS.contains(word)) {
                    arrayAfterSorting.add(word);
                }
            }
        }
        return arrayAfterSorting;
    }

    public List<String> filterWords(List<String> arrayToCheck, int maxWordLength) {
        List<String> arrayWithSmallWords = new ArrayList<>();
        for (String word : arrayToCheck) {
            if (word.length() < maxWordLength || FORBIDDEN_WORDS.contains(word)) {
                arrayWithSmallWords.add(word);
            }
        }
        return arrayWithSmallWords;
    }

    public Map<String, Integer> createWordMap(List<String> list) {
        Map<String, Integer> wordMap = new HashMap<>();
        for (final String word : list) {
            if (wordMap.containsKey(word)) {
                int intValue = wordMap.get(word);
                wordMap.put(word, ++intValue);
            } else {
                wordMap.put(word, 1);
            }
        }
        return wordMap;
    }

    public String findMostRepeatedWord(Map<String, Integer> wordMap) {
        int maxValue = 0;
        String mostRepeatedWord = "";
        Set<Map.Entry<String, Integer>> set = wordMap.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            final Integer intValue = entry.getValue();
            if (maxValue < intValue) {
                maxValue = intValue;
                mostRepeatedWord = entry.getKey();
            }
        }
        return mostRepeatedWord;
    }
}