import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calc;
    @BeforeEach
    public void setup()
    {
        calc = new Calculator();
    }
    @Test
    public void testAdd_Success()
    {
        assertEquals(4, calc.add(2,2));
    }

    @Test
    public void testAdd_fail()
    {
        Exception ex = assertThrows(ArithmeticExcedption.class, ()-> calc.add(Integer.Max_Value, 1));

    }


}
