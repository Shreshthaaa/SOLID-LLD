public class ConsoleUI implements IFrameUI {
    @Override
    public void showPlaying(byte[] fileBytes) {
        System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");
    }
}
