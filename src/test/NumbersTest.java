import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    Numbers numbers = new Numbers();

    @Test
    void sumNumbers() {
        assertEquals(5, numbers.sumNumbers(2, 3));
        assertEquals(-1, numbers.sumNumbers(1, -2));
        assertEquals(0, numbers.sumNumbers(0, 0));
    }

    @Test
    void multiplyNumbers() {
        assertEquals(6, numbers.multiplyNumbers(2, 3));
        assertEquals(-2, numbers.multiplyNumbers(1, -2));
        assertEquals(0, numbers.multiplyNumbers(0, 5));
    }

    @Test
    void subtractNumbers() {
        assertEquals(-1, numbers.subtractNumbers(2, 3));
        assertEquals(3, numbers.subtractNumbers(1, -2));
        assertEquals(0, numbers.subtractNumbers(0, 0));
    }

    @Test
    void divideNumbers() {
        assertEquals(2, numbers.divideNumbers(6, 3));
        assertEquals(-2, numbers.divideNumbers(4, -2));
    }

    @Test
    void divideNumbersByZero() {
        assertThrows(ArithmeticException.class, () -> numbers.divideNumbers(5, 0));
    }
}