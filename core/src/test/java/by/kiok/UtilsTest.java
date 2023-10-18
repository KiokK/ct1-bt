package by.kiok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class UtilsTest {

    @Nested
    class IsAllPositiveNumbers {
        @Test
        void isAllPositiveNumbersReturnTrue() {
            Assertions.assertTrue(Utils.isAllPositiveNumbers("2", "23", "12312"));
        }

        @Test
        void isAllPositiveNumbersReturnFalse() {
            Assertions.assertFalse(Utils.isAllPositiveNumbers("2", "0", "12312"));
        }
    }
}
