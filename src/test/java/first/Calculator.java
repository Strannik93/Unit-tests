package first;

import org.assertj.core.api.DoubleAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import org.seminars.first.Calculator.*;

public class Calculator {
    @Test
    public void calculateDiscountTest() {
        org.seminars.first.Calculator.Calculator calculator = new org.seminars.first.Calculator.Calculator();
        assertThat(org.seminars.first.Calculator.Calculator.calculatingDiscount(200,50)).isEqualTo(100);
    }

    @Test
    public void calculateDiscountArithmeticExceptionTest() {
        org.seminars.first.Calculator.Calculator calculator = new org.seminars.first.Calculator.Calculator();
        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> org.seminars.first.Calculator.Calculator.calculatingDiscount(200, 105));
    }
}
