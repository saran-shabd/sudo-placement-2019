package stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EvaluatePostFixExpSolverTest {
    private EvaluatePostFixExpSolver solver;

    @Before
    public void setUp() {
        solver = new EvaluatePostFixExpSolver();
    }

    @Test
    public void testcase1() {
        String expr = "231*+9-";
        int result = solver.solve(expr);
        assertEquals(-4, result);
    }

    @Test
    public void testcase2() {
        String expr = "123+*8-";
        int result = solver.solve(expr);
        assertEquals(-3, result);
    }
}
