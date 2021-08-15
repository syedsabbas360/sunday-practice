import org.assertj.core.api.AbstractIntegerAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    void fibonacciOfOneIsOne() {
        assertThat(fibonacci.of(1)).isEqualTo(1);
    }

    @Test
    void fibonacciOfZeroIsZero() {
        assertThat(fibonacci.of(0)).isEqualTo(0);
    }


}