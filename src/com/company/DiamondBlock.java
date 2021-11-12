package com.company;

public class DiamondBlock extends Block {
    public DiamondBlock(int durability, int stack) {
        super(durability, stack);
    }

    @Override
    public void doSound() {
        System.out.println("*kamené kopání*");
    }
}
