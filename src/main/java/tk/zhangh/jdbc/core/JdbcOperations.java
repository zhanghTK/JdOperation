package tk.zhangh.jdbc.core;

/**
 * 定义JdbcTemplate操作
 * Created by ZhangHao on 17/3/21.
 */
public interface JdbcOperations {
    <R> R execute(ConnectionCallback<R> action);

    <R> R execute(StatementCallback<R> action);

    <R> R execute(String sql, PreparedStatementCallback<R> action);

    <R> R execute(String sql);
}
