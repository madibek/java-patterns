package kz.malgara.oberver;

import kz.malgara.oberver.publisher.NewsPublisher;
import kz.malgara.oberver.subscriber.Company;
import kz.malgara.oberver.subscriber.User;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        NewsPublisher newsPublisher = new NewsPublisher();
        User madi = new User("Madi", newsPublisher);
        User zaman = new User("Zaman", newsPublisher);
        Company apple = new Company("Apple Inc.", newsPublisher);
        publishNews("bar", newsPublisher);
        // unsubscribe
        newsPublisher.removeSubscriber(madi);
        publishNews("foo", newsPublisher);
    }

    private static void publishNews(String news, NewsPublisher newsPublisher) throws InterruptedException {
        newsPublisher.setNews(news);
        Thread.sleep(10000);
    }
}
