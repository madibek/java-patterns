package kz.malgara.oberver.subject;

import kz.malgara.oberver.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherStation implements Subject {

    private Set<Observer> observers;
    private int temperate;
    private int windSpeed;
    private int pressure;

    public WeatherStation() {
        this.observers = new HashSet<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperate, windSpeed, pressure);
        }
    }

    public int getTemperate() {
        return temperate;
    }

    public void setTemperate(int temperate) {
        this.temperate = temperate;
        this.notifyObservers();
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
        this.notifyObservers();
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        this.notifyObservers();
    }
}
