package DuckGame3;

public class MallardDuck extends Duck  {

    MallardDuck (){
        this.flyBehaivor = new FlyWithWings();
        this.soundBehaivor = new QuackSound();
    }

    @Override
    public void display() {
        System.out.println("Show Mallard Duck");
    }


}
