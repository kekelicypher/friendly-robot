package Prime;
import static org.junit.Assert.*;
import org.junit.Test;



public class isPrimeTest {

    @Test
    public void testPrimeNumbers() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
        assertTrue(Prime.isPrime(13));
        assertTrue(Prime.isPrime(17));
        assertTrue(Prime.isPrime(97));
    }

    @Test
    public void testNonPrimeNumbers() {
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(9));
        assertFalse(Prime.isPrime(15));
        assertFalse(Prime.isPrime(100));
    }

    @Test
    public void testEdgeCases() {
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(-1));
        assertFalse(Prime.isPrime(-7));
    }
}