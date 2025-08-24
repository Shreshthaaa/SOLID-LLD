public class Player {
    private final IDecoder decoder;
    private final IFrameUI ui;
    private final ICache cache;

    public Player(IDecoder decoder, IFrameUI ui, ICache cache) {
        this.decoder = decoder;
        this.ui = ui;
        this.cache = cache;
    }

    public void play(byte[] fileBytes){
        // decode
        Frame f = decoder.decode(fileBytes); // pretend decoding
        // draw UI
        ui.showPlaying(fileBytes);
        // cache
        cache.store(f);
        System.out.println("Cached last frame? " + cache.hasLastFrame());
    }
}
