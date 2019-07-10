package arraysAndSearching;

import static org.junit.Assert.*;
import org.junit.*;

public class FirstAndLastOccurrenceOfXSolverTest {

    private FirstAndLastOccurrenceOfXSolver solver;

    @Before
    public void setUp() {
        solver = new FirstAndLastOccurrenceOfXSolver();
    }

    @Test
    public void testcase1() {
        String result = solver.solve(new int[]{1, 2, 3}, 4);
        assertEquals("-1", result);
    }

    @Test
    public void testcase2() {
        String result = solver.solve(new int[]{1, 2, 2, 2, 3, 4}, 2);
        assertEquals("1 3", result);
    }

    @Test
    public void testcase3() {
        String result = solver.solve(new int[]{1, 2, 2, 2, 3, 4}, 4);
        assertEquals("5 5", result);
    }
}
