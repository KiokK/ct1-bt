package by.kihtenkoolga;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Nested
    class IsPositiveNumber {

        @Test
        void isPositiveNumberReturnTrue() {
            Assertions.assertAll(
                    () -> Assertions.assertTrue(StringUtils.isPositiveNumber("182726262655353535251511111111")),
                    () -> Assertions.assertTrue(StringUtils.isPositiveNumber("10")),
                    () -> Assertions.assertTrue(StringUtils.isPositiveNumber("4"))
            );
        }

        @Test
        void isPositiveNumberReturnFalse() {
            Assertions.assertAll(
                    () -> Assertions.assertFalse(StringUtils.isPositiveNumber("-1210")),
                    () -> Assertions.assertFalse(StringUtils.isPositiveNumber("0")),
                    () -> Assertions.assertFalse(StringUtils.isPositiveNumber("00000")),
                    () -> Assertions.assertFalse(StringUtils.isPositiveNumber("-0")),
                    () -> Assertions.assertFalse(StringUtils.isPositiveNumber("12.6"))
            );
        }
    }
}
