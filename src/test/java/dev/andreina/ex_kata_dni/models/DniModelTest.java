package dev.andreina.ex_kata_dni.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DniModelTest {
    private final DniModel dniModel = new DniModel();

    @Test
    void testCalculateLetter() {
        assertEquals('Z', dniModel.CalculateLetter(12345678));

    
        
    }

    @Test
    void testIsValid() {
        assertTrue(dniModel.isValid(45986456));
        
        assertFalse(dniModel.isValid(100000000));

    }
}
