package CLJava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc 
{
    @Test
    void add() {
        assertEquals(Calc.add(1, 2), 3);
    }
    
}
