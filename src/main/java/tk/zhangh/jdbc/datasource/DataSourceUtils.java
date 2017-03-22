package tk.zhangh.jdbc.datasource;

import tk.zhangh.jdbc.exception.JdbcConnectionGetException;
import tk.zhangh.jdbc.exception.JdbcConnectionReleaseException;
import tk.zhangh.jdbc.exception.StatementCloseException;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DataSource帮助类
 * Created by ZhangHao on 17/3/22.
 */
public class DataSourceUtils {
    public static Connection getConnection(DataSource dataSource) {
        assert dataSource != null;
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new JdbcConnectionGetException("Could not get JDBC Connection", e);
        }
    }

    public static void releaseConnection(Connection connection) {
        if (connection == null) {
            return;
        }
        try {
            connection.close();
        } catch (SQLException e) {
            throw new JdbcConnectionReleaseException("Could not release JDBC Connection", e);
        }
    }

    public static void colseStatement(Statement statement) {
        if (statement == null) {
            return;
        }
        try {
            statement.close();
        } catch (SQLException e) {
            throw new StatementCloseException("Could not close Statement", e);
        }
    }
}
