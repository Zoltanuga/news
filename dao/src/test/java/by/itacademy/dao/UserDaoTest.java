package by.itacademy.dao;

import by.itacademy.dao.impl.UserDao;
import junit.framework.TestCase;
import org.junit.Assert;


public class UserDaoTest extends TestCase {


    public void testUserDao() {
        UserDao userDao = UserDao.getInstance();
        Assert.assertNotNull(userDao);
        Assert.assertNotNull(userDao.obtainUser("zzz@gmail.com"));
        Assert.assertNotNull(userDao.obtainUserList());
        Assert.assertEquals(userDao.obtainUser("zzz@gmail.com").getEmail().equals("zzz@gmail.com"), true);
    }
}
