package stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxAreaInMatrixSolverTest {
    private MaxAreaInMatrixSolver solver;

    @Before
    public void setUp() {
        solver = new MaxAreaInMatrixSolver();
    }

    @Test
    public void testcase1() {
        int [][] arr = {
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 }
        };
        int result = solver.solve(arr);
        assertEquals(8, result);
    }
}
