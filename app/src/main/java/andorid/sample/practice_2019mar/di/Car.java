package andorid.sample.practice_2019mar.di;

public class Car {
    private static final String TAG = "Car";

    private Wheels wheels;
    private Engine engine;

    public Car(Wheels wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    public void drive() {

    }
}
