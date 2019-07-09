package arraysAndSearching;

import org.junit.*;
import static org.junit.Assert.*;

public class CountDistinctElementsInEveryWindowSolverTest {

    private CountDistinctElementsInEveryWindowSolver solver;

    @Before
    public void setUp() {
        solver = new CountDistinctElementsInEveryWindowSolver();
    }

    @Test
    public void testcase1() {
        String result = solver.solve(7, 4, new int[]{1, 2, 1, 3, 4, 2, 3});
        assertEquals("3 4 4 3 ", result);
    }

    @Test
    public void testcase2() {
        String result = solver.solve(3, 2, new int[]{4, 1, 1});
        assertEquals("2 1 ", result);
    }
}
