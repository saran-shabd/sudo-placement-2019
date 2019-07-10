package arraysAndSearching;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PythagoreanTripletSolverTest {

    private PythagoreanTripletSolver solver;

    @Before
    public void setUp() {
        solver = new PythagoreanTripletSolver();
    }

    @Test
    public void testcase1() {
        boolean result = solver.solve(new int[]{ 3, 4, 5, 6, 1 });
        assertTrue(result);
    }

    @Test
    public void testcase2() {
        boolean result = solver.solve(new int[]{ 10, 4, 6, 12, 5 });
        assertFalse(result);
    }
}
