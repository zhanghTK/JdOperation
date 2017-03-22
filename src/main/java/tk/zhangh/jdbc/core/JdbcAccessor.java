package tk.zhangh.jdbc.core;


import lombok.Data;
import lombok.experimental.Accessors;
import tk.zhangh.jdbc.support.SQLExceptionTranslator;

import javax.sql.DataSource;

/**
 * 为JdbcTemplate提供公用属性
 * Created by ZhangHao on 17/3/21.
 */
@Data
@Accessors(chain = true)
public abstract class JdbcAccessor {
    protected DataSource dataSource;
    protected SQLExceptionTranslator sqlExceptionTranslator;
}
