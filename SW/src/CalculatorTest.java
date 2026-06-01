import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    
    @Test
    public void testAddInt() {
        Calculator calc = new Calculator();
        // 2 + 3이 5가 맞는지 테스트합니다.
        assertEquals(5, calc.addInt(2, 3), "2 + 3은 5여야 합니다.");
    }
}