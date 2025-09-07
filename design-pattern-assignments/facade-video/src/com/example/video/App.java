package com.example.video;

import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        VideoPipelineFacade facade = new VideoPipelineFacade(
            new Decoder(),
            new FilterEngine(),
            new LegacySharpenAdapter(new LegacySharpen()),
            new Encoder()
        );

        Path out = facade.process(Path.of("in.mp4"), Path.of("out.mp4"));
        System.out.println("Wrote " + out);
    }
}
