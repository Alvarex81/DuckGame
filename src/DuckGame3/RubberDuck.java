package DuckGame3;

public class RubberDuck extends Duck {

    RubberDuck () {
        this.flyBehaivor = new FlyNoWay();
        this.soundBehaivor = new SqueakSound();
    }

    @Override
    public void display() {
        System.out.println("Show Rubber Duck");
    }

}
