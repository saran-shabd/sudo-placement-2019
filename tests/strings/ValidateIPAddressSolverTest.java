package strings;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValidateIPAddressSolverTest {

    private ValidateIPAddressSolver solver;

    @Before
    public void setUp() {
        solver = new ValidateIPAddressSolver();
    }

    @Test
    public void testcase1() {
        boolean result = solver.solve("127.0.0.1");
        assertTrue(result);
    }

    @Test
    public void testcase2() {
        boolean result = solver.solve("256.0.0.1");
        assertFalse(result);
    }

    @Test
    public void testcase3() {
        boolean result = solver.solve("127..0.1");
        assertFalse(result);
    }

    @Test
    public void testcase4() {
        boolean result = solver.solve("10.0.0.as");
        assertFalse(result);
    }

    @Test
    public void testcase5() {
        boolean result = solver.solve("1.2.3.04");
        assertFalse(result);
    }

    @Test
    public void testcase6() {
        boolean result = solver.solve("0.0.0.0");
        assertTrue(result);
    }

    @Test
    public void testcase7() {
        boolean result = solver.solve("0.0.0.0.");
        assertFalse(result);
    }

    @Test
    public void testcase8() {
        boolean result = solver.solve("0.0.0.0..");
        assertFalse(result);
    }
}
