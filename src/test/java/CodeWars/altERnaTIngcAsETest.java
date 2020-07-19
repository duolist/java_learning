package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class altERnaTIngcAsETest {

    @Test
    void toAlternativeString() {

        assertEquals("HELLO WORLD", altERnaTIngcAsE.toAlternativeString("hello world"));
        assertEquals("hello world", altERnaTIngcAsE.toAlternativeString("HELLO WORLD"));
        assertEquals("HELLO world", altERnaTIngcAsE.toAlternativeString("hello WORLD"));
        assertEquals("hEllO wOrld", altERnaTIngcAsE.toAlternativeString("HeLLo WoRLD"));
        assertEquals("Hello World", altERnaTIngcAsE.toAlternativeString(altERnaTIngcAsE.toAlternativeString("Hello World")));
        assertEquals("12345", altERnaTIngcAsE.toAlternativeString("12345"));
        assertEquals("1A2B3C4D5E", altERnaTIngcAsE.toAlternativeString("1a2b3c4d5e"));
        assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", altERnaTIngcAsE.toAlternativeString("StringUtils.toAlternatingCase"));
    }

    @Test
    public void kataTitleTests() {
        assertEquals("ALTerNAtiNG CaSe", altERnaTIngcAsE.toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", altERnaTIngcAsE.toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", altERnaTIngcAsE.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", altERnaTIngcAsE.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }
    }
