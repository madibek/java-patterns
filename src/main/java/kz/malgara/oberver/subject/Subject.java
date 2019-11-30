package kz.malgara.oberver.subject;

import kz.malgara.oberver.Observer;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
