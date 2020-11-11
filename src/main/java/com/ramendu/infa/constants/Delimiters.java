package com.ramendu.infa.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Delimiters {
    public static final String QUERY_DELIMITER = "?q=";
    public static final String PARAM_DELIMITER = "&";
    public static final String KEY_VAL_DELIMITER_COLON = ":";
    public static final String KEY_VAL_DELIMITER_EQUALS = "=";
}