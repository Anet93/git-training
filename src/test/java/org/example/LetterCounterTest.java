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
}
