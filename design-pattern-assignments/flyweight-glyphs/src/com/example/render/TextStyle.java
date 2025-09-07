package com.example.render;

import java.util.Objects;

public class TextStyle {
    private final String font;
    private final int size;
    private final boolean bold;

    public TextStyle(String font, int size, boolean bold) {
        this.font = font;
        this.size = size;
        this.bold = bold;
    }

    public int drawCost() {
        return size + (bold ? 10 : 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TextStyle)) return false;
        TextStyle ts = (TextStyle) o;
        return size == ts.size && bold == ts.bold &&
               Objects.equals(font, ts.font);
    }

    @Override
    public int hashCode() {
        return Objects.hash(font, size, bold);
    }
}
