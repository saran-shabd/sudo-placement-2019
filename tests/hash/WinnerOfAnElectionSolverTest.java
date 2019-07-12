package hash;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WinnerOfAnElectionSolverTest {

    private WinnerOfAnElectionSolver solver;

    @Before
    public void setUp() {
        solver = new WinnerOfAnElectionSolver();
    }

    @Test
    public void testcase1() {
        String result = solver.solve(new String[]{
                "john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny", "jamie", "johnny", "john"
        });
        assertEquals("john 4", result);
    }

    @Test
    public void testcase2() {
        String result = solver.solve(new String[]{
                "andy", "blake", "clark"
        });
        assertEquals("andy 1", result);
    }

    @Test
    public void testcase3() {
        String result = solver.solve(new String[]{
                "andy", "blake", "clark", "blake"
        });
        assertEquals("blake 2", result);
    }

    @Test
    public void testcase4() {
        String result = solver.solve(new String[]{"a", "b", "c", "d"});
        assertEquals("a 1", result);
    }

    @Test
    public void testcase5() {
        String result = solver.solve(new String[]{
                "john", "mike", "harry", "ron", "rob"
        });
        assertEquals("harry 1", result);
    }
}
