package kz.malgara.oberver.publisher;

import kz.malgara.oberver.subscriber.Subscriber;

public interface Publisher {

    void addSubscriber(Subscriber s);

    void removeSubscriber(Subscriber subscriber);

    void notifySubscribers();
}
