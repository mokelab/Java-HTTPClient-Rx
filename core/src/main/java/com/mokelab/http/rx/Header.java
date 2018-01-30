package com.mokelab.http.rx;

import java.util.List;
import java.util.Map;

/**
 * Describes HTTP header
 */
public interface Header extends Map<String, String> {
    List<String> getMultiple(String key);
}
