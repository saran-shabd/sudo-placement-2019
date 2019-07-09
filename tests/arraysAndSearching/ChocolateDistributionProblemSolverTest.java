package arraysAndSearching;

import org.junit.*;
import static org.junit.Assert.*;

public class ChocolateDistributionProblemSolverTest {

    private ChocolateDistributionProblemSolver solver;

    @Before
    public void setUp() {
        solver = new ChocolateDistributionProblemSolver();
    }

    @Test
    public void testcase1() {
        int solution = solver.solve(8, 5, new int[]{3, 4, 1, 9, 56, 7, 9, 12});
        assertEquals(6, solution);
    }

    @Test
    public void testcase2() {
        int solution = solver.solve(7, 3, new int[]{7, 3, 2, 4, 9, 12, 56});
        assertEquals(2, solution);
    }
}
