package bitMagic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindOddOccurrenceSolverTest {

    private FindOddOccurrenceSolver solver;

    @Before
    public void setUp() {
        solver = new FindOddOccurrenceSolver();
    }

    @Test
    public void testcase1() {
        int result = solver.solve(new int[]{1, 2, 3, 3, 2});
        assertEquals(1, result);
    }

    @Test
    public void testcase2() {
        int result = solver.solve(new int[]{8, 4, 4, 8, 23});
        assertEquals(23, result);
    }
}
