package hash;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfArrayContainsContiguousElementsWithDuplicatesSolverTest {

    private CheckIfArrayContainsContiguousElementsWithDuplicatesSolver solver;

    @Before
    public void setUp() {
        solver = new CheckIfArrayContainsContiguousElementsWithDuplicatesSolver();
    }

    @Test
    public void testcase1() {
        boolean result = solver.solve(new int[]{ 5, 2, 3, 6, 4, 4, 6, 6 });
        assertTrue(result);
    }

    @Test
    public void testcase2() {
        boolean result = solver.solve(new int[]{ 10, 14, 10, 12, 12, 13, 15 });
        assertFalse(result);
    }
}
