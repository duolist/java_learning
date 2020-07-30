package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertStringToArrayTest {

    @Test
    void stringToArray() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, ConvertStringToArray.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, ConvertStringToArray.stringToArray("I love arrays they are my favorite"));
    }
}