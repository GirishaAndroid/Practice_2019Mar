package andorid.sample.practice_2019mar.designPatterns;

import android.util.Log;

public class Sunscriber1 implements Observer {
    @Override
    public void update() {
        Log.d("DesingPattern","Sunscriber1");
    }
}
