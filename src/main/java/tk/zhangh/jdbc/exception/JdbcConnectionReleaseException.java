package tk.zhangh.jdbc.exception;

/**
 * JDBC连接释放异常
 * Created by ZhangHao on 17/3/22.
 */
public class JdbcConnectionReleaseException extends DataAccessException {
    public JdbcConnectionReleaseException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
