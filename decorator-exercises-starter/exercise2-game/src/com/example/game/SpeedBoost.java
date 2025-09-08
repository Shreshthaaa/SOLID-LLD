package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    private final int boost;

    public SpeedBoost(Character inner, int boost) {
        super(inner);
        this.boost = boost;
    }

    @Override
    public void move() {
        System.out.println("Moving at boosted speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public int getSpeed() {
        return inner.getSpeed() + boost;
    }
}
