package arraysAndSearching;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeakElementSolverTest {

    private PeakElementSolver solver;

    @Before
    public void setUp() {
        solver = new PeakElementSolver();
    }

    @Test
    public void testcase1() {
        int result = solver.solve(new int[]{ 1, 3, 20, 4, 1, 0 });
        assertEquals(2, result);
    }

    @Test
    public void testcase2() {
        int result = solver.solve(new int[]{ 10, 20, 15, 2, 23, 90, 67 });
        if (result == 1 || result == 5)
            assertTrue(true);  // test case passed
        else
            fail();  // test case failed
    }

    @Test
    public void testcase3() {
        int result = solver.solve(new int[]{ 1, 1, 1, 1 });
        assertEquals(-1, result);
    }
}
