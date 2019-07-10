package arraysAndSearching;

import static org.junit.Assert.*;
import org.junit.*;

public class FloorInSortedArraySolverTest {

    private FloorInSortedArraySolver solver;

    @Before
    public void setUp() {
        solver = new FloorInSortedArraySolver();
    }

    @Test
    public void testcase1() {
        int result = solver.solve(new int[]{ 1, 2, 3, 4 }, 3);
        assertEquals(2, result);
    }

    @Test
    public void testcase2() {
        int result = solver.solve(new int[]{ 1, 2, 3, 5, 6 }, 4);
        assertEquals(2, result);
    }

    @Test
    public void testcase3() {
        int result = solver.solve(new int[]{ 1, 2, 8, 10, 10, 12, 19 }, 5);
        assertEquals(1, result);
    }

    @Test
    public void testcase4() {
        int result = solver.solve(new int[]{ 1, 2, 8, 10, 10, 12, 19 }, 20);
        assertEquals(6, result);
    }

    @Test
    public void testcase5() {
        int result = solver.solve(new int[]{ 1, 2, 8, 10, 10, 12, 19 }, 0);
        assertEquals(-1, result);
    }
}
