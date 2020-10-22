package DuckGame3;

public class RedHeadDuck extends Duck {

    RedHeadDuck () {
        this.flyBehaivor = new FlyWithWings();
        this.soundBehaivor = new QuackSound();
    }

    @Override
    public void display() {
        System.out.println("Show Red Head Duck");
    }

}
