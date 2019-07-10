package bitMagic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstSetBitSolverTest {

    private FirstSetBitSolver solver;

    @Before
    public void setUp() {
        solver = new FirstSetBitSolver();
    }

    @Test
    public void testcase1() {
        int result = solver.solve(18);
        assertEquals(2, result);
    }

    @Test
    public void testcase2() {
        int result = solver.solve(12);
        assertEquals(3, result);
    }

    @Test
    public void testcase3() {
        int result = solver.solve(0);
        assertEquals(0, result);
    }
}
