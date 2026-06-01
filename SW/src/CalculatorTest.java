import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    
    @Test
    public void testAddInt() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.addInt(3, 3), "2 + 3은 5여야 합니다.");
    }

    @Test
    public void testSubtractInt() {
        Calculator calc = new Calculator();
        assertEquals(7, calc.subtractInt(10, 3), "10 - 5는 5여야 합니다.");
    }

    @Test
    public void testMultiplyInt() {
        Calculator calc = new Calculator();
        assertEquals(40, calc.multiplyInt(5, 7), "4 * 6은 24여야 합니다.");
    }

    @Test
    public void testDivideInt() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.divideInt(20, 4), "20 / 5는 4여야 합니다.");
    }
}