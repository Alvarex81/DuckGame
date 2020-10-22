package DuckGame3;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();

        actDuck("Mallar Duck", mallardDuck);
        actDuck("Red Head Duck", redHeadDuck);
        actDuck("Rubber Duck", rubberDuck);

    }

    public static void actDuck (String name, Duck duck){

        System.out.println(name);
        System.out.println("---------------------");
        duck.performSound();
        duck.display();
        duck.swim();
        duck.performFly();
        System.out.println("---------------------");
    }
}
