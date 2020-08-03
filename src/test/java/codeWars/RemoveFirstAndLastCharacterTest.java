package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstAndLastCharacterTest {

    @Test
    void remove() {
        assertEquals("loquen", RemoveFirstAndLastCharacter.remove("eloquent"));
        assertEquals("ountr", RemoveFirstAndLastCharacter.remove("country"));
        assertEquals("erso", RemoveFirstAndLastCharacter.remove("person"));
        assertEquals("lac", RemoveFirstAndLastCharacter.remove("place"));
    }
}