package andorid.sample.practice_2019mar.designPatterns;

import java.util.ArrayList;
import java.util.Iterator;

public class Publisher implements Subject {

    ArrayList<Observer> arrayList = new ArrayList<>();

    @Override
    public void registerObsrver(Observer subscriber) {
        arrayList.add(subscriber);
    }

    @Override
    public void unregisterObserver(Observer subscriber) {
        arrayList.remove(subscriber);
    }

    @Override
    public void notifyObserver() {
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Observer subscriber = (Observer) iterator.next();
            subscriber.update();
        }
    }
}
