package edu.grupo2.DuckGame;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    void display() {
        System.out.println("Show Rubber Duck");
    }

    @Override
    public void fly() {
        System.out.println("Rubber duck does not fly");
    }
}
