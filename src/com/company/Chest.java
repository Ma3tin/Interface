package com.company;

public class Chest extends Block implements ICanRightClick{
    public Chest(int durability, int stack) {
        super(durability, stack);
    }

    @Override
    public void onAction() {
        System.out.println("Otevři Bednu");
    }

    @Override
    public void doSound() {
        System.out.println("*Dřevněné skřípání*");
    }
}
