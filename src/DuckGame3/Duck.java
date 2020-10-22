package DuckGame3;

public class Duck {

    FlyBehaivor flyBehaivor;
    SoundBehaivor soundBehaivor;

    public void swim (){
        System.out.println ("swimming");
    }

    void display(){
        //must be extended
    };

    void performFly(){
        flyBehaivor.fly();
    }

    void performSound(){
        soundBehaivor.play();
    }

}
