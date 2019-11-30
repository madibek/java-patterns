package kz.malgara.oberver.publisher;

import kz.malgara.oberver.subscriber.Subscriber;

import java.util.HashSet;
import java.util.Set;

public class NewsPublisher implements Publisher {

    private Set<Subscriber> subscribers;
    private String news;

    public NewsPublisher() {
        this.subscribers = new HashSet<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this.news);
        }
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
        this.notifySubscribers();
    }
}
