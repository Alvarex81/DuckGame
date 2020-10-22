package DuckGame3;

public class DecoyDuck extends Duck {

    DecoyDuck ()
    {
        this.flyBehaivor = new FlyWithWings();
        this.soundBehaivor = new QuackSound();
    }

    @Override
    public void display() {
        System.out.println("Show Decoy Duck");
    }

}
