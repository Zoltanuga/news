package by.itacademy.service;


import junit.framework.TestCase;
import org.junit.Assert;

public class NewsServiceTest extends TestCase {
    public void testNewsService() {
        NewsService newsService = NewsService.getInstance();
        newsService.addNews("1", "1");
        Assert.assertNotNull(newsService);
        Assert.assertNotNull(newsService.obtainNewsList());
        Assert.assertNotNull(newsService.obtainNews(1));
        Assert.assertEquals(newsService.obtainNews(1).getId() == 1, true);
    }
}
