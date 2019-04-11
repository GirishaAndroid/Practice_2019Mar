package andorid.sample.practice_2019mar.designPatterns.Demo.ObserverPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class ViewClass extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Observer sunscriber1 = new Sunscriber1();
        Observer subscriber2 = new Subscriber2();

        Subject publisher = new Publisher();
        publisher.registerObsrver(sunscriber1);
        publisher.registerObsrver(subscriber2);

        publisher.notifyObserver();
    }
}
