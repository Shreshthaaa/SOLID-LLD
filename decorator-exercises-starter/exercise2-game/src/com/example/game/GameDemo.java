package com.example.game;

public class GameDemo {
    public static void main(String[] args) {
        Character base = new BaseCharacter();

        System.out.println("--- Base ---");
        base.move();
        base.attack();

        // Base + SpeedBoost + DamageBoost
        System.out.println("\n--- Buffed (Speed + Damage) ---");
        Character buffed = new DamageBoost(new SpeedBoost(base, 3), 15);
        buffed.move();
        buffed.attack();

        // Add GoldenAura
        System.out.println("\n--- Shiny (with GoldenAura) ---");
        Character shiny = new GoldenAura(buffed);
        shiny.move();
        shiny.attack();

        // Remove GoldenAura
        System.out.println("\n--- Without Aura (recomposed) ---");
        Character withoutAura = buffed;
        withoutAura.move();
        withoutAura.attack();
    }
}
