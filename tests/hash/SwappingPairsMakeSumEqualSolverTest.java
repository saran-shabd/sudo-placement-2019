package hash;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwappingPairsMakeSumEqualSolverTest {
    private SwappingPairsMakeSumEqualSolver solver;

    @Before
    public void setUp() {
        solver = new SwappingPairsMakeSumEqualSolver();
    }

    @Test
    public void testcase1() {
        boolean result = solver.solve(
                new int[]{ 6, 3 },
                new int[]{ 5, 2 }
        );
        assertTrue(result);
    }

    @Test
    public void testcase2() {
        boolean result = solver.solve(
                new int[]{ 4, 1, 2, 1, 1, 2 },
                new int[]{ 3, 6, 3, 3 }
        );
        assertTrue(result);
    }

    @Test
    public void testcase3() {
        boolean result = solver.solve(
                new int[]{ 5, 7, 4, 6 },
                new int[]{ 1, 2, 3, 8 }
        );
        assertTrue(result);
    }
}
