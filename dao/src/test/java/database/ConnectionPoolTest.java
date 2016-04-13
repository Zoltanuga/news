package database;


import by.itacademy.database.ConnectionPool;
import junit.framework.TestCase;
import org.junit.Assert;

public class ConnectionPoolTest extends TestCase {
    public void testConnectionPool() {
        Assert.assertNotNull(ConnectionPool.getInstance());
    }
}
