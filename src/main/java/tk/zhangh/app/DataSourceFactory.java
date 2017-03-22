package tk.zhangh.app;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * DataSource工厂
 * Created by ZhangHao on 17/3/23.
 */
public class DataSourceFactory {
    public static DataSource dataSource() throws Exception {
        Properties properties = new Properties();
        properties.load(DataSourceFactory.class.getResourceAsStream("/jdbc.properties"));
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName(properties.getProperty("jdbc.driver"));
        source.setUsername(properties.getProperty("jdbc.username"));
        source.setPassword(properties.getProperty("jdbc.password"));
        source.setUrl(properties.getProperty("jdbc.url"));
        return source;
    }
}
