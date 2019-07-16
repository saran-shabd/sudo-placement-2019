package recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JosephusProblemSolverTest {
    private JosephusProblemSolver solver;

    @Before
    public void setUp() {
        solver = new JosephusProblemSolver();
    }

    @Test
    public void testcase1() {
        int result = solver.solve(3, 2);
        assertEquals(3, result);
    }

    @Test
    public void testcase2() {
        int result = solver.solve(5, 3);
        assertEquals(4, result);
    }

    @Test
    public void testcase3() {
        int result = solver.solve(8, 2);
        assertEquals(1, result);
    }
}
