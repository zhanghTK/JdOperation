package tk.zhangh.scalpel.jdbc.core;

import tk.zhangh.scalpel.jdbc.datasource.DataSourceUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC操作helper
 * Created by ZhangHao on 17/3/21.
 */
public class JdbcTemplate extends JdbcAccessor implements JdbcOperations {

    @Override
    public <R> R execute(ConnectionCallback<R> action) {
        Connection connection = DataSourceUtils.getConnection(getDataSource());
        return action.callBack(connection);
    }

    @Override
    public <R> R execute(StatementCallback<R> action) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DataSourceUtils.getConnection(getDataSource());
            statement = connection.createStatement();
            return action.callBack(statement);
        } catch (SQLException e) {
            throw sqlExceptionTranslator.translate("", e);
        } finally {
            DataSourceUtils.colseStatement(statement);
            DataSourceUtils.releaseConnection(connection);
        }
    }

    @Override
    public <R> R execute(String sql, PreparedStatementCallback<R> action) {
        return null;
    }

    @Override
    public <R> R execute(String sql) {
        return null;
    }
}
