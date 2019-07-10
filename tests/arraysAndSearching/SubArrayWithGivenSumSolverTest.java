package arraysAndSearching;

import static org.junit.Assert.*;
import org.junit.*;

public class SubArrayWithGivenSumSolverTest {

    private SubArrayWithGivenSumSolver solver;

    @Before
    public void setUp() {
        solver = new SubArrayWithGivenSumSolver();
    }

    @Test
    public void testcase1() {
        String result = solver.solve(new int[]{1, 2, 3, 4, 5, 6}, 10);
        assertEquals("1 4", result);
    }

    @Test
    public void testcase2() {
        String result = solver.solve(new int[]{1, 2, 3, 4, 5, 6}, 7);
        assertEquals("3 4", result);
    }
}
