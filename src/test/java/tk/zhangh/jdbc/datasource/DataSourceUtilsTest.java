package tk.zhangh.jdbc.datasource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tk.zhangh.app.BeanFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

/**
 * DataSource帮助类测试
 * Created by ZhangHao on 17/3/23.
 */
public class DataSourceUtilsTest {

    private DataSource dataSource;

    @Before
    public void init() throws Exception {
        dataSource = BeanFactory.dataSource();
    }

    @Test
    public void testGetConnection() throws Exception {
        Assert.assertNotNull(DataSourceUtils.getConnection(dataSource));
    }

    @Test
    public void testReleaseConnection() throws Exception {
        Connection connection = DataSourceUtils.getConnection(dataSource);
        DataSourceUtils.releaseConnection(connection);
    }

    @Test
    public void testCloseStatement() throws Exception {
        Statement statement = DataSourceUtils.getConnection(dataSource).createStatement();
        DataSourceUtils.closeStatement(statement);
    }
}