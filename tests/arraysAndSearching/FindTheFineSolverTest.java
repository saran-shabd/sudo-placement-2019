package arraysAndSearching;

import org.junit.*;
import static org.junit.Assert.*;

public class FindTheFineSolverTest {

    private FindTheFineSolver solver;

    @Before
    public void setUp() {
        solver = new FindTheFineSolver();
    }

    @Test
    public void testcase1() {
        int result = solver.solve(new int[]{2375, 7682, 2325, 2352}, new int[]{250, 500, 350, 200}, 12);
        assertEquals(600, result);
    }

    @Test
    public void testcase2() {
        int result = solver.solve(new int[]{2222, 2223, 2224}, new int[]{200, 300, 400}, 12);
        assertEquals(300, result);
    }
}
