public interface ICache {
    void store(Frame frame);
    boolean hasLastFrame();
}
