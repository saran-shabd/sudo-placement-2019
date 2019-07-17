package misc;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

import static org.junit.Assert.*;

public class PairTest {

    @Test
    public void equalsTestCase1() {
        Pair<Integer, Integer> pair1 = new Pair<>(1, 3);
        Pair<Integer, Integer> pair2 = new Pair<>(1, 3);

        assertEquals(pair1, pair2);
    }

    @Test
    public void equalsTestCase2() {
        Pair<Integer, String> pair1 = new Pair<>(1, "test");
        Pair<Integer, String> pair2 = new Pair<>(1, "test");

        assertEquals(pair1, pair2);
    }

    @Test
    public void equalsTestCase3() {
        Pair<Integer, Character> pair1 = new Pair<>(1, 'c');
        Pair<Character, Integer> pair2 = new Pair<>('c', 3);

        assertNotEquals(pair1, pair2);
    }

    @Test
    public void equalsTestCase4() {
        Pair<Integer, BigInteger> pair1 = new Pair<>(1, new BigInteger("123"));
        Pair<Integer, String> pair2 = new Pair<>(1, "123");

        assertNotEquals(pair1, pair2);
    }

    @Test
    public void equalsTestCase5() {
        Pair<Integer, Character> pair1 = new Pair<>(1, 'a');
        Pair<Integer, Character> pair2 = new Pair<>(1, 'a');

        assertEquals(pair1, pair2);
    }

    @Test
    public void equalsTestCase6() {
        Pair<BigInteger, BigDecimal> pair1 = new Pair<>(new BigInteger("2"), new BigDecimal("3"));
        Pair<BigInteger, BigDecimal> pair2 = new Pair<>(new BigInteger("2"), new BigDecimal("3"));

        assertEquals(pair1, pair2);
    }

    @Test
    public void equalsTestCase7() {
        Pair<BigInteger, BigDecimal> pair1 = new Pair<>(new BigInteger("2"), new BigDecimal("13"));
        Pair<BigInteger, BigDecimal> pair2 = new Pair<>(new BigInteger("2"), new BigDecimal("3"));

        assertNotEquals(pair1, pair2);
    }

    @Test
    public void hashCodeTestCase1() {
        Pair<Integer, Character> pair1 = new Pair<>(1, 'a');
        Pair<Integer, Character> pair2 = new Pair<>(1, 'a');

        assertEquals(pair1.hashCode(), pair2.hashCode());
    }

    @Test
    public void hashCodeTestCase2() {
        Pair<Integer, Character> pair1 = new Pair<>(1, 'a');
        Pair<Integer, Character> pair2 = new Pair<>(1, 'b');

        assertNotEquals(pair1.hashCode(), pair2.hashCode());
    }

    @Test
    public void hashCodeTestCase3() {
        Pair<Integer, Character> pair1 = new Pair<>(1, 'a');
        Pair<Character, Integer> pair2 = new Pair<>('a', 1);

        assertEquals(pair1.hashCode(), pair2.hashCode());
    }

    @Test
    public void hashCodeTestCase4() {
        Pair<Integer, Double> pair1 = new Pair<>(1, 1.2);
        Pair<Integer, Double> pair2 = new Pair<>(1, 1.2);

        HashSet<Pair<Integer, Double>> set = new HashSet<>();
        set.add(pair1);
        set.add(pair2);

        assertEquals(1, set.size());
    }

    @Test
    public void hashCodeTestCase5() {
        Pair<Integer, Double> pair1 = new Pair<>(1, 1.2);
        Pair<Integer, Double> pair2 = new Pair<>(1, 1.3);

        HashSet<Pair<Integer, Double>> set = new HashSet<>();
        set.add(pair1);
        set.add(pair2);

        assertEquals(2, set.size());
    }

    @Test
    public void toStringTestCase1() {
        Pair<Integer, String> pair = new Pair<>(1, "test");

        assertEquals("1:test", pair.toString());
    }
}
