package hash;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueNumbersSolverTest {
    private UniqueNumbersSolver solver;

    @Before
    public void setUp() {
        solver = new UniqueNumbersSolver();
    }

    @Test
    public void testcase1() {
        String result = solver.solve(1, 20);
        assertEquals(
                "1 2 3 4 5 6 7 8 9 10 12 13 14 15 16 17 18 19 20 ",
                result
        );
    }
}
