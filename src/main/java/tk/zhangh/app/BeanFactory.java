package tk.zhangh.app;

import org.apache.commons.dbcp.BasicDataSource;
import tk.zhangh.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * Bean工厂,部分替代IoC功能
 * Created by ZhangHao on 17/3/23.
 */
public class BeanFactory {
    public static DataSource dataSource() {
        Properties properties = new Properties();
        try {
            properties.load(BeanFactory.class.getResourceAsStream("/jdbc.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName(properties.getProperty("jdbc.driver"));
        source.setUsername(properties.getProperty("jdbc.username"));
        source.setPassword(properties.getProperty("jdbc.password"));
        source.setUrl(properties.getProperty("jdbc.url"));
        return source;
    }

    public static JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }
}
