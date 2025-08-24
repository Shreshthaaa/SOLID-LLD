public class FrameCache implements ICache {
    private Frame last;

    @Override
    public void store(Frame frame) {
        this.last = frame;
    }

    @Override
    public boolean hasLastFrame() {
        return this.last != null;
    }    
}
