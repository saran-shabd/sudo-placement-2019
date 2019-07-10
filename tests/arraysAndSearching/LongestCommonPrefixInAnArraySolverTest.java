package arraysAndSearching;

import static org.junit.Assert.*;
import org.junit.*;

public class LongestCommonPrefixInAnArraySolverTest {

    private LongestCommonPrefixInAnArraySolver solver;

    @Before
    public void setUp() {
        solver = new LongestCommonPrefixInAnArraySolver();
    }

    @Test
    public void testcase1() {
        String result = solver.solve(new String[]{"geeks", "geek", "gee"});
        assertEquals("gee", result);
    }

    @Test
    public void testcase2() {
        String result = solver.solve(new String[]{ "temp", "result" });
        assertEquals("-1", result);
    }
}
