package kz.malgara.oberver;

import kz.malgara.oberver.subject.Subject;

public class AllerSystem implements Observer {

    private Subject subject;

    public AllerSystem(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(int temperate, int windSpeed, int pressure) {
        System.out.println("temp: " + temperate);
        System.out.println("windSpeed: " + windSpeed);
        System.out.println("pressure: " + pressure);
    }
}
