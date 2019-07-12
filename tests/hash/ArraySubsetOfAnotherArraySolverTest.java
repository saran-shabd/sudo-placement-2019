package hash;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySubsetOfAnotherArraySolverTest {

    private ArraySubsetOfAnotherArraySolver solver;

    @Before
    public void setUp() {
        solver = new ArraySubsetOfAnotherArraySolver();
    }

    @Test
    public void testcase1() {
        boolean result = solver.solve(
                    new int[]{ 11, 1, 13, 21, 3, 7 },
                    new int[]{ 11, 3, 7, 1 }
                );
        assertTrue(result);
    }

    @Test
    public void testcase2() {
        boolean result = solver.solve(
                new int[]{ 1, 2, 3, 4, 5, 6 },
                new int[]{ 1, 2, 4 }
        );
        assertTrue(result);
    }

    @Test
    public void testcase3() {
        boolean result = solver.solve(
                new int[]{ 10, 5, 2, 23, 19 },
                new int[]{ 19, 5, 3 }
        );
        assertFalse(result);
    }
}
