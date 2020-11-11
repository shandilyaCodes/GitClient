package com.ramendu.infa.utils;

import com.ramendu.infa.constants.ParamKey;
import org.springframework.stereotype.Component;
import static com.ramendu.infa.constants.Delimiters.*;
import static com.ramendu.infa.constants.EndPoints.GITHUB_SEARCH_BASE_URL;
import static com.ramendu.infa.constants.ParamKey.KEY_LANGUAGE;
import static com.ramendu.infa.constants.ParamKey.KEY_PAGE;

@Component
public class UrlUtils {

    public String searchUrlByLanguage(String language,
                                      Long pageNumber) {
        return GITHUB_SEARCH_BASE_URL
               + QUERY_DELIMITER
               + KEY_LANGUAGE
               + KEY_VAL_DELIMITER_COLON
               + language
               + PARAM_DELIMITER
               + KEY_PAGE
               + KEY_VAL_DELIMITER_EQUALS
               + pageNumber;
    }
    
    public String searchUrlByLanguageAndUser(String language,
                                             String userName) {
        return GITHUB_SEARCH_BASE_URL
                + QUERY_DELIMITER
                + ParamKey.KEY_USER
                + KEY_VAL_DELIMITER_COLON
                + userName
                + PARAM_DELIMITER
                + KEY_LANGUAGE
                + KEY_VAL_DELIMITER_COLON
                + language;
    }
    
    public String searchUrlByLanguageSorted(String language,
                                            Long pageNumber,
                                            String sortingParameter,
                                            String sortingStyle) {
        return searchUrlByLanguage(language, pageNumber)
                + PARAM_DELIMITER
                + ParamKey.KEY_SORT
                + KEY_VAL_DELIMITER_EQUALS
                + sortingParameter
                + PARAM_DELIMITER
                + ParamKey.KEY_ORDER
                + KEY_VAL_DELIMITER_EQUALS
                + sortingStyle;
    }
}