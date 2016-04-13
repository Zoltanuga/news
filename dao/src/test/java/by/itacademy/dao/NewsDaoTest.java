package by.itacademy.dao;


import by.itacademy.dao.impl.NewsDao;

import junit.framework.TestCase;
import org.junit.Assert;

public class NewsDaoTest extends TestCase {
    public void testNewsDao() {
        NewsDao newsDao = NewsDao.getInstance();
        Assert.assertNotNull(newsDao);
        Assert.assertNotNull(newsDao.obtainListNews());
        Assert.assertNotNull(newsDao.obtainNews(1));
        Assert.assertEquals(newsDao.obtainNews(1).getId() == 1, true);
    }
}
