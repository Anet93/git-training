package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class LetterCounter {

    public Map<Character, Integer> countLetters(BufferedReader in) throws IOException {
        Map<Character, Integer> result = new HashMap<Character, Integer>();
        String line = in.readLine();
        countLetters(line, result);
        return result;
    }

    private void countLetters(String line, Map<Character, Integer> result) {
        for (int i = 0; i< line.length(); i++) {
            Character ch = Character.toLowerCase(line.charAt(i));
            if (result.get(ch) == null) {
                result.put(ch, 1);
            } else {
                int count = result.get(ch);
                result.put(ch, count + 1);
            }
        }
    }
}
