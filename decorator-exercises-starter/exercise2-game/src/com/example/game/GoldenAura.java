package com.example.game;

public class GoldenAura extends CharacterDecorator {
    public GoldenAura(Character inner) {
        super(inner);
    }

    @Override
    public void move() {
        System.out.println("Golden Aura active!");
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("Golden Aura active!");
        System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }

    @Override
    public int getSpeed() {
        return inner.getSpeed() + 2;
    }

    @Override
    public int getDamage() {
        return inner.getDamage() + 5;
    }

    @Override
    public String getSprite() {
        return "golden_" + inner.getSprite();
    }
}
