package strings;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ReverseWordSolverTest {

    private ReverseWordSolver solver;

    @Before
    public void setUp() {
        solver = new ReverseWordSolver();
    }

    @Test
    public void testcase1() {
        String result = solver.solve("this.is.a.temp.string");
        assertEquals("string.temp.a.is.this", result);
    }
}
