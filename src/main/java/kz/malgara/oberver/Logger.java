package kz.malgara.oberver;

import kz.malgara.oberver.subject.Subject;

public class Logger implements Observer {

    private int windSpeed;
    private Subject subject;

    public Logger(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(int temperate, int windSpeed, int value) {
        this.windSpeed = windSpeed;
        this.log();
    }

    private void log() {
        System.out.println("Wind speed: " + windSpeed);
    }
}
