package tk.zhangh.scalpel.jdbc.exception;

/**
 * JDBC连接获取异常
 * Created by ZhangHao on 17/3/22.
 */
public class JdbcConnectionGetException extends DataAccessException {
    public JdbcConnectionGetException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
