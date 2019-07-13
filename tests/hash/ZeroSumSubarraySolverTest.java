package hash;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroSumSubarraySolverTest {
    private ZeroSumSubarraySolver solver;

    @Before
    public void setUp() {
        solver = new ZeroSumSubarraySolver();
    }

    @Test
    public void testcase1() {
        int result = solver.solve(new int[]{ 1, 2, -2, 3 });
        assertEquals(1, result);
    }

    @Test
    public void testcase2() {
        int result = solver.solve(new int[]{ 0, 0, 5, 5, 0, 0 });
        assertEquals(6, result);
    }

    @Test
    public void testcase3() {
        int result = solver.solve(new int[]{ 6,  -1, -3, 4, -2, 2, 4, 6, -12, -7 });
        assertEquals(4, result);
    }
}
