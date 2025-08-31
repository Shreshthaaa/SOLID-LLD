import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();

        UserProfile p = svc.createMinimal("u1", "a@b.com");
        System.out.println("Email = " + p.getEmail());

        UserProfile updated = svc.withDisplayName(p, "Alice Wonderland");
        System.out.println("Original displayName = " + p.getDisplayName());
        System.out.println("Updated displayName  = " + updated.getDisplayName());
    }
}
