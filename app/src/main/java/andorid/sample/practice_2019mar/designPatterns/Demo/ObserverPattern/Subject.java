package andorid.sample.practice_2019mar.designPatterns.Demo.ObserverPattern;

public interface Subject {

    void registerObsrver(Observer subscriber);
    void unregisterObserver(Observer subscriber);
    void notifyObserver();
}
