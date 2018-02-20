import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {
    Division di = new Division();

    @Test(expected = ArithmeticException.class)
    public void TestdivZero(){

        di.div(2,0);
    }
}