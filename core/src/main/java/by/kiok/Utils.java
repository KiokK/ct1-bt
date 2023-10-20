package by.kiok;

import by.kihtenkoolga.StringUtils;

import java.util.Arrays;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str){
        return Arrays.stream(str)
                .filter(s -> !StringUtils.isPositiveNumber(s))
                .findAny()
                .isEmpty();
    }

}
