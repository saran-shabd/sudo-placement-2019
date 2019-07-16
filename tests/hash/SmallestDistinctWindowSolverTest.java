package hash;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestDistinctWindowSolverTest {
    private SmallestDistinctWindowSolver solver;

    @Before
    public void setUp() {
        solver = new SmallestDistinctWindowSolver();
    }

    @Test
    public void testcase1() {
        int result = solver.solve("abc".toCharArray());
        assertEquals(3, result);
    }

    @Test
    public void testcase2() {
        int result = solver.solve("abca".toCharArray());
        assertEquals(3, result);
    }

    @Test
    public void testcase3() {
        int result = solver.solve("abac".toCharArray());
        assertEquals(3, result);
    }

    @Test
    public void testcase4() {
        int result = solver.solve("aabcd".toCharArray());
        assertEquals(4, result);
    }

    @Test
    public void testcase5() {
        int result = solver.solve("aabcbcdbca".toCharArray());
        assertEquals(4, result);
    }

    @Test
    public void testcase6() {
        int result = solver.solve("aaab".toCharArray());
        assertEquals(2, result);
    }

    @Test
    public void testcase7() {
        int result = solver.solve("aaabaaaaaa".toCharArray());
        assertEquals(2, result);
    }

    @Test
    public void testcase8() {
        int result = solver.solve("aaabaaaacaa".toCharArray());
        assertEquals(6, result);
    }

    @Test
    public void testcase9() {
        int result = solver.solve(
                "lcpsklryvmcpjnbpbwllsrehfmxrkecwitrsglrexvtjmxypunbqfgxmuvgfajclfvenhyuhuorjosamibdn"
                        .toCharArray()
        );
        assertEquals(55, result);
    }
}
