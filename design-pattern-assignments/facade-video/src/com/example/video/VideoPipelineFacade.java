package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    private final Decoder decoder;
    private final FilterEngine filters;
    private final LegacySharpenAdapter sharpen;
    private final Encoder encoder;

    public VideoPipelineFacade(Decoder decoder, FilterEngine filters, LegacySharpenAdapter sharpen, Encoder encoder) {
        this.decoder = decoder;
        this.filters = filters;
        this.sharpen = sharpen;
        this.encoder = encoder;
    }

    public Path process(Path in, Path out) {
        Frame[] frames = decoder.decode(in);

        frames = filters.grayscale(frames);
        frames = filters.scale(frames, 0.5);

        frames = sharpen.sharpen(frames, 5);

        return encoder.encode(frames, out);
    }
}
