package tk.zhangh.jdbc.exception;

/**
 * 数据访问异常基础类
 * Created by ZhangHao on 17/3/21.
 */
public class DataAccessException extends RuntimeException {

    public DataAccessException(String msg) {
        super(msg);
    }

    public DataAccessException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
