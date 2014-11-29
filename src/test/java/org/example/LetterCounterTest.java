package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import org.junit.Test;


public class LetterCounterTest {

    LetterCounter counter = new LetterCounter();
    
    @Test
    public void countsSingleLetter() throws IOException {
        Map<Character, Integer> result = counter.countLetters(new BufferedReader(new StringReader("a")));
        
        assertThat(result)
            .hasSize(1)
            .containsEntry('a', 1);
    }
    
    @Test
    public void countsLetterInSingleLine() throws IOException {
        Map<Character, Integer> result = counter.countLetters(new BufferedReader(new StringReader("abcd")));
        
        assertThat(result)
            .hasSize(4)
            .containsEntry('a', 1)
            .containsEntry('b', 1)
            .containsEntry('c', 1)
            .containsEntry('d', 1);
    }
    
    @Test
    public void correctlyCountsRepeatedLetter() throws IOException {
        Map<Character, Integer> result = counter.countLetters(new BufferedReader(new StringReader("abcdaaa")));
        
        assertThat(result)
            .hasSize(4)
            .containsEntry('a', 4)
            .containsEntry('b', 1)
            .containsEntry('c', 1)
            .containsEntry('d', 1);
    }
    
    @Test
    public void ignoresCase() throws IOException {
        Map<Character, Integer> result = counter.countLetters(new BufferedReader(new StringReader("AAaa")));
        
        assertThat(result)
            .hasSize(1)
            .containsEntry('a', 4);
    }
}
