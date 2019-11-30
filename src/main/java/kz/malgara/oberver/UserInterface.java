package kz.malgara.oberver;

import kz.malgara.oberver.subject.Subject;

public class UserInterface implements Observer {


    private int temperate;
    private int windSpeed;
    private Subject subject;

    public UserInterface(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(int temperate, int windSpeed, int pressure) {
        this.temperate = temperate;
        this.windSpeed = windSpeed;
        this.display();
    }

    private void display() {
        System.out.println("User interface: " + temperate);
    }
}
