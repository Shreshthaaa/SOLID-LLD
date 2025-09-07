package com.example.video;

public class LegacySharpenAdapter {
    private final LegacySharpen legacy;

    public LegacySharpenAdapter(LegacySharpen legacy) {
        this.legacy = legacy;
    }

    public Frame[] sharpen(Frame[] frames, int strength) {
        String handle = "HANDLE:" + frames.length;
        String newHandle = legacy.applySharpen(handle, strength);

        System.out.println("Applied legacy sharpen with strength " + strength + " → " + newHandle);
        return frames;
    }
}
