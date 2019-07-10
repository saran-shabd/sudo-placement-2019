package bitMagic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountTotalSetBitsSolverTest {

    private CountTotalSetBitsSolver solver;

    @Before
    public void setUp() {
        solver = new CountTotalSetBitsSolver();
    }

    @Test
    public void testcase1() {
        int result = solver.solve(4);
        assertEquals(5, result);
    }

    @Test
    public void testcase2() {
        int result = solver.solve(17);
        assertEquals(35, result);
    }
}
