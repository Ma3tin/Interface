package com.company;

public abstract class Block {
    private int durability;
    private int stack;

    public Block(int durability, int stack) {
        this.durability = durability;
        this.stack = stack;
    }

    public abstract void doSound();
}
