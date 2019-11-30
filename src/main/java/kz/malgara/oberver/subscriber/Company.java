package kz.malgara.oberver.subscriber;

import kz.malgara.oberver.publisher.Publisher;

public class Company implements Subscriber {

    private String name;
    private String news;
    private Publisher publisher;

    public Company(String name, Publisher publisher) {
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
