package arraysAndSearching;

import org.junit.*;
import static org.junit.Assert.*;

public class LeadersInAnArraySolverTest {

    private LeadersInAnArraySolver solver;

    @Before
    public void setUp() {
        solver = new LeadersInAnArraySolver();
    }

    @Test
    public void testcase1() {
        String result = solver.solve(new int[]{16, 17, 4, 3, 5, 2});
        assertEquals("17 5 2 ", result);
    }

    @Test
    public void testcase2() {
        String result = solver.solve(new int[]{1, 2, 3, 4, 0});
        assertEquals("4 0 ", result);
    }

    @Test
    public void testcase3() {
        String result = solver.solve(new int[]{7, 4, 5, 7, 3});
        assertEquals("7 7 3 ", result);
    }
}
