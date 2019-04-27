package algorithms.string;

import algorithms.Algorithm;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;

class DuplicateCharactersTest {

    private static Algorithm<Map<Character, Integer>, String> algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new DuplicateCharacters();
    }

    @Tag("question")
    @Test
    void question() {
        assertNotNull(algorithm.question());
    }

    @Tag("solution")
    @Test
    void solution() {
        Map<Character, Integer> map = algorithm.solution("aabcdea");
        assertEquals(Optional.of(3), Optional.ofNullable(map.get('a')), "Test Failed because map result " + map.toString());
    }
}