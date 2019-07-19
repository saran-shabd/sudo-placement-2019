package stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxAreaHistogramSolverTest {
    private MaxAreaHistogramSolver solver;

    @Before
    public void setUp() {
        solver = new MaxAreaHistogramSolver();
    }

    @Test
    public void testcase1() {
        int [] arr = { 6, 2, 5, 4, 5, 1, 6 };
        int result = solver.solve(arr);
        assertEquals(12, result);
    }

    @Test
    public void testcase2() {
        int [] arr = { 6, 3, 4, 2 };
        int result = solver.solve(arr);
        assertEquals(9, result);
    }
}
