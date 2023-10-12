package third;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.seminars.third.hw.Metods;

import static org.junit.jupiter.api.Assertions.*;

public class MetodsTest {
    private Metods metods;

    @BeforeEach
    public void setUp() {
        metods = new Metods();
    }

    // Проверка на четное число
    @Test
    public void testEvenNumber() {
        assertTrue(metods.evenOddNumber(6));
    }

    // Проверка на нечетное число
    @Test
    public void testOddNumber() {
        assertFalse(metods.evenOddNumber(5));
    }

    // Проверка на вхождение в диапозон 25-100
    @Test
    public void testInInterval() {
        assertTrue(metods.numberInInterval(45));
    }

    // Проверка на не вхождение в этот диапозон
    @Test
    public void testNotInInterval() {
        assertFalse(metods.numberInInterval(125));
    }
}
