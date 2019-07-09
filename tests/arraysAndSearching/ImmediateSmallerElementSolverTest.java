package arraysAndSearching;

import org.junit.*;
import static org.junit.Assert.*;

public class ImmediateSmallerElementSolverTest {

    private ImmediateSmallerElementSolver solver;

    @Before
    public void setUp() {
        solver = new ImmediateSmallerElementSolver();
    }

    @Test
    public void testcase1() {
        String result = solver.solve(new int[]{4, 2, 1, 5, 3});
        assertEquals("2 1 -1 3 -1", result);
    }

    @Test
    public void testcase2() {
        String result = solver.solve(new int[]{5, 6, 2, 3, 1, 7});
        assertEquals("-1 2 -1 1 -1 -1", result);
    }
}
