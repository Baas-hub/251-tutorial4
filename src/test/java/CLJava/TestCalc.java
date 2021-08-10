package CLJava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc 
{
    @Test
    void testAdd() {
        assertEquals(Calc.add(1, 2), 3);
    }
    
    @Test
    void testSubtract() {
        assertEquals(Calc.subtract(2, 1), 1);
    }
    
}
