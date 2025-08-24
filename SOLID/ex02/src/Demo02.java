public class Demo02 {
    public static void main(String[] args) {
        IDecoder decoder = new Decoder();
        IFrameUI ui = new ConsoleUI();
        ICache cache = new FrameCache();
        
        Player player = new Player(decoder, ui, cache);
        player.play(new byte[]{1,2,3,4});
    }
}
