package tk.zhangh.scalpel.jdbc.support;

import tk.zhangh.scalpel.jdbc.exception.DataAccessException;

import java.sql.SQLException;

/**
 * 异常转换
 * Created by ZhangHao on 17/3/22.
 */
public class SQLExceptionTranslator {
    public DataAccessException translate(String message, SQLException e) {
        return new DataAccessException(message, e);
    }
}
