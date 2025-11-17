package ie.atu.week7;

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
        Exception ex = assertThrows(ArithmeticException.class, ()-> calc.add(Integer.MAX_VALUE, 1));

    }


}
