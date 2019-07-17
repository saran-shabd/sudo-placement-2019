package stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StockSpanProblemSolverTest {
    private StockSpanProblemSolver solver;

    @Before
    public void setUp() {
        solver = new StockSpanProblemSolver();
    }

    @Test
    public void testcase1() {
        int [] input = new int[]{ 100, 80, 60, 70, 60, 75, 85 };
        int [] expected = new int[]{ 1, 1, 1, 2, 1, 4, 6 };

        int [] result = solver.solve(input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testcase2() {
        int [] input = new int[]{ 10, 4, 5, 90, 120, 80 };
        int [] expected = new int[]{ 1, 1, 2, 4, 5, 1 };

        int [] result = solver.solve(input);

        assertArrayEquals(expected, result);
    }
}
