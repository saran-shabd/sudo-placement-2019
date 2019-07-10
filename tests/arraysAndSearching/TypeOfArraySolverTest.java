package arraysAndSearching;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeOfArraySolverTest {

    private TypeOfArraySolver solver;

    @Before
    public void setUp() {
        solver = new TypeOfArraySolver();
    }

    @Test
    public void testcase1() {
        String result = solver.solve(new int[]{2, 1, 5, 4, 3});
        assertEquals("5 3", result);
    }

    @Test
    public void testcase2() {
        String result = solver.solve(new int[]{3, 4, 5, 1, 2});
        assertEquals("5 4", result);
    }

    @Test
    public void testcase3() {
        String result = solver.solve(new int[]{1, 2, 3, 4, 5, 8});
        assertEquals("8 1", result);
    }

    @Test
    public void testcase4() {
        String result = solver.solve(new int[]{9, 5, 4, 3, 2, 1});
        assertEquals("9 2", result);
    }
}
