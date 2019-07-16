package recursion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberOfPathsSolverTest {
    private NumberOfPathsSolver solver;

    @Before
    public void setUp() {
        solver = new NumberOfPathsSolver();
    }

    @Test
    public void testcase1() {
        int result = solver.solve(3, 3);
        assertEquals(6, result);
    }

    @Test
    public void testcase2() {
        int result = solver.solve(2, 8);
        assertEquals(8, result);
    }
}
