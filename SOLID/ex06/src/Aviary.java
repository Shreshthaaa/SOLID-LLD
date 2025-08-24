public class Aviary {
    public void release(Bird b) {
        if (b instanceof Flyable) {
            ((Flyable) b).fly();
        }
        System.out.println("Released");
    }
}