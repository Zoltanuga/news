package by.itacademy.service;


import junit.framework.TestCase;
import org.junit.Assert;

public class UserServiceTest  extends TestCase{
    public void testUserService(){
        UserService userService = UserService.getInstance();
        Assert.assertNotNull(userService);
        Assert.assertNotNull(userService.obtainUser("zzz@gmail.com"));
        Assert.assertNotNull(userService.obtainUserList());
        Assert.assertEquals(userService.obtainUser("zzz@gmail.com").getEmail().equals("zzz@gmail.com"), true);
    }
}
