package com.company;

public class SweetBerries extends Block implements IGrow, ICanRightClick{
    public SweetBerries(int durability, int stack) {
        super(durability, stack);
    }

    @Override
    public void onAction() {
        System.out.println("Vezmi rybíz");
    }

    @Override
    public void grow() {
        System.out.println("*Vyrostlo o kus*");
    }

    @Override
    public void doSound() {
        System.out.println("*Tuf*");
    }
}
