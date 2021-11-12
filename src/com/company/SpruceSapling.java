package com.company;

public class SpruceSapling extends Block implements IGrow{
    public SpruceSapling(int durability, int stack) {
        super(durability, stack);
    }

    @Override
    public void doSound() {
        System.out.println("*Tuf*");
    }

    @Override
    public void grow() {
        System.out.println("*Vyrostlo o kus*");
    }
}
