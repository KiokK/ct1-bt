package by.kihtenkoolga;

/**
 * Класс обработки строк
 */
public class StringUtils {

    private static boolean isNumeric(String str) {
        return str.chars().filter(c -> !(c >= '0' && c <= '9')).findAny().isEmpty();
    }

    private static boolean isZero(String str) {
        return str.chars().filter(c -> c != '0').findAny().isEmpty();
    }

    /**
     * Проверяет строку на соответствие положительному целому числу
     * @param str проверяемая числа
     * @return true, если строка состоит только из цифр, в противном случае false.
     * Для числа 0 ответ - false
     */
    public static boolean isPositiveNumber(String str) {
        return str.length() != 0 && isNumeric(str) && !isZero(str);
    }
}
