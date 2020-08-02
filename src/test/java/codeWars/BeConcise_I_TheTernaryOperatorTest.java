package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeConcise_I_TheTernaryOperatorTest {

    @Test
    void describeAge() {
        assertEquals("You're a(n) kid", BeConcise_I_TheTernaryOperator.describeAge(9));
        assertEquals("You're a(n) kid", BeConcise_I_TheTernaryOperator.describeAge(10));
        assertEquals("You're a(n) kid", BeConcise_I_TheTernaryOperator.describeAge(11));
        assertEquals("You're a(n) kid", BeConcise_I_TheTernaryOperator.describeAge(12));
        assertEquals("You're a(n) teenager", BeConcise_I_TheTernaryOperator.describeAge(13));
        assertEquals("You're a(n) teenager", BeConcise_I_TheTernaryOperator.describeAge(14));
        assertEquals("You're a(n) teenager", BeConcise_I_TheTernaryOperator.describeAge(15));
        assertEquals("You're a(n) teenager", BeConcise_I_TheTernaryOperator.describeAge(16));
        assertEquals("You're a(n) teenager", BeConcise_I_TheTernaryOperator.describeAge(17));
        assertEquals("You're a(n) adult", BeConcise_I_TheTernaryOperator.describeAge(18));
        assertEquals("You're a(n) adult", BeConcise_I_TheTernaryOperator.describeAge(19));
        assertEquals("You're a(n) adult", BeConcise_I_TheTernaryOperator.describeAge(63));
        assertEquals("You're a(n) adult", BeConcise_I_TheTernaryOperator.describeAge(64));
        assertEquals("You're a(n) elderly", BeConcise_I_TheTernaryOperator.describeAge(65));
        assertEquals("You're a(n) elderly", BeConcise_I_TheTernaryOperator.describeAge(66));
        assertEquals("You're a(n) elderly", BeConcise_I_TheTernaryOperator.describeAge(100));
    }
}