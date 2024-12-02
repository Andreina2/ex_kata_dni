package dev.andreina.ex_kata_dni.view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dev.andreina.ex_kata_dni.models.person;

public class DniViewTest {
    person person = new person("Andreina", "Arias", 12345678);

    @Test
    void testAskFirstName() {
        assertEquals("Andreina", person.getFirstName());

    }

    @Test
    void testAskLastName() {
        assertEquals("Arias", person.getLastName());

    }

    @Test
    void testDniNumber() {
        assertEquals(12345678, person.getDni());

    }
}
