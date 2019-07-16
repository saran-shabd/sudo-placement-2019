package hash;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountDistinctPairsWithDifferenceKSolverTest {
    private CountDistinctPairsWithDifferenceKSolver solver;

    @Before
    public void setUp() {
        solver = new CountDistinctPairsWithDifferenceKSolver();
    }

    @Test
    public void testcase1() {
        int result = solver.solve(new int[]{ 1, 5, 4, 1, 2 }, 0);
        assertEquals(1, result);
    }

    @Test
    public void testcase2() {
        int result = solver.solve(new int[]{ 1, 1, 1 }, 0);
        assertEquals(1, result);
    }

    @Test
    public void testcase3() {
        int result = solver.solve(new int[]{ 1, 5, 3 }, 2);
        assertEquals(2, result);
    }

    @Test
    public void testcase4() {
        int result = solver.solve(new int[]{ 1, 4, 3 }, 2);
        assertEquals(1, result);
    }

    @Test
    public void testcase5() {
        int result = solver.solve(new int [] { 4, 5, 6, 2, 3, 1 }, 2);
        assertEquals(4, result);
    }
}
