package kz.malgara.oberver.subscriber;

import kz.malgara.oberver.publisher.Publisher;

public class User implements Subscriber {
    private Publisher publisher;
    private String name;
    private String news;

    public User(String name, Publisher publisher) {
        this.name = name;
        this.publisher = publisher;
        this.publisher.addSubscriber(this);
    }

    @Override
    public void update(String value) {
        this.news = value;
        this.displayNews();
    }

    public void displayNews() {
        System.out.println("news (" + this.name + "): " + this.news);
    }
}
