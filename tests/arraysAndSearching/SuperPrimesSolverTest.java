package arraysAndSearching;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuperPrimesSolverTest {

    private SuperPrimesSolver solver;

    @Before
    public void setUp() {
        solver = new SuperPrimesSolver();
    }

    @Test
    public void testcase1() {
        int result = solver.solve(5);
        assertEquals(1, result);
    }

    @Test
    public void testcase2() {
        int result = solver.solve(10);
        assertEquals(3, result);
    }

    @Test
    public void testcase3() {
        int result = solver.solve(17);
        assertEquals(4, result);
    }
}
