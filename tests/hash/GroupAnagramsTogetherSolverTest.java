package hash;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GroupAnagramsTogetherSolverTest {

    private GroupAnagramsTogetherSolver solver;

    @Before
    public void setUp() {
        solver = new GroupAnagramsTogetherSolver();
    }

    @Test
    public void testcase1() {
        String result = solver.solve(new String[]{
            "act", "cat", "tac", "god", "dog"
        });
        assertEquals("2 3 ", result);
    }

    @Test
    public void testcase2() {
        String result = solver.solve(new String[]{
                "act", "cat", "tac"
        });
        assertEquals("3 ", result);
    }

    @Test
    public void testcase3() {
        String result = solver.solve(new String[]{
                "ad", "bc"
        });
        assertEquals("1 1 ", result);
    }
}
