package compoundpattern.cooperation;

/**
 * @author WilsonSong
 * @date 2018/10/10/010
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstrctDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstrctDuckFactory duckFactory){
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));

        System.out.println("\nDuck Simulator: With Composite - Flocks");

        Flock flock = new Flock();

        flock.add(redheadDuck);
        flock.add(rubberDuck);
        flock.add(duckCall);
        flock.add(gooseDuck);

        Flock flock1 = new Flock();

        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();

        flock1.add(mallardDuck1);
        flock1.add(mallardDuck2);
        flock1.add(mallardDuck3);
        flock1.add(mallardDuck4);

        flock.add(flock1);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flock);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flock1);

        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);

        simulate(flock);

        System.out.println("The duck quacked "+QuackCounter.getQuacks()+" times");
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
