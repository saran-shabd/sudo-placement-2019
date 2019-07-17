package stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrintBracketNumberSolverTest {
    private PrintBracketNumberSolver solver;

    @Before
    public void setUp() {
        solver = new PrintBracketNumberSolver();
    }

    @Test
    public void testcase1() {
        String result = solver.solve("(a+(b*c))+(d/e)");
        assertEquals("1 2 2 1 3 3 ", result);
    }

    @Test
    public void testcase2() {
        String result = solver.solve("((())(()))");
        assertEquals("1 2 3 3 2 4 5 5 4 1 ", result);
    }

    @Test
    public void testcase3() {
        String result = solver.solve("((((()");
        assertEquals("1 2 3 4 5 5 ", result);
    }
}
