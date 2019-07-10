package strings;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BinaryStringSolverTest {

    private BinaryStringSolver solver;

    @Before
    public void setUp() {
        solver = new BinaryStringSolver();
    }

    @Test
    public void testcase1() {
        int result = solver.solve("00100101");
        assertEquals(3, result);
    }

    @Test
    public void testcase2() {
        int result = solver.solve("1111");
        assertEquals(6, result);
    }

    @Test
    public void testcase3() {
        int result = solver.solve("01101");
        assertEquals(3, result);
    }
}
