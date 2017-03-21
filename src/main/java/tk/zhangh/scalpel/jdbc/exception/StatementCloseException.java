package tk.zhangh.scalpel.jdbc.exception;

/**
 * Statement关闭异常
 * Created by ZhangHao on 17/3/22.
 */
public class StatementCloseException extends DataAccessException {
    public StatementCloseException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
