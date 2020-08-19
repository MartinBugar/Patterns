package prometheus.patterns.observer;


import java.util.Observable;
import java.util.Observer;

public class Noviny implements Observer { //observer
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Noviny pisu : " + arg);
    }
}
