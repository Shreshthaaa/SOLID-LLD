package com.example.render;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TextStyleFactory {
    private static final Map<TextStyle, TextStyle> cache = new ConcurrentHashMap<>();

    public static TextStyle get(String font, int size, boolean bold) {
        TextStyle key = new TextStyle(font, size, bold);
        return cache.computeIfAbsent(key, k -> key);
    }
}
