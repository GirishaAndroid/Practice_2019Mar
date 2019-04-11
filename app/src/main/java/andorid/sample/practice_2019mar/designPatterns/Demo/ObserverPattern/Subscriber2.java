package andorid.sample.practice_2019mar.designPatterns.Demo.ObserverPattern;

import android.util.Log;

public class Subscriber2 implements Observer {

    @Override
    public void update() {
        Log.d("DesingPattern","Sunscriber2");
    }
}
