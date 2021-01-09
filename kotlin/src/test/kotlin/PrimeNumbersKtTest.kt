import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PrimeNumbersKtTest {
    @Test
    fun `when enter 1 then return false`() {
        assertFalse(isPrimeNumber(1))
    }

    @Test
    fun `when enter 2 then return true`() {
        assertTrue(isPrimeNumber(2))
    }

    @Test
    fun `when enter 3 then return true`() {
        assertTrue(isPrimeNumber(3))
    }

    @Test
    fun `when enter 5 then return true`() {
        assertTrue(isPrimeNumber(5))
    }

    @Test
    fun `when enter 9 then return false`() {
        assertFalse(isPrimeNumber(9))
    }
}