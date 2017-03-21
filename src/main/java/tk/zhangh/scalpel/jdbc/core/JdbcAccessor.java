package tk.zhangh.scalpel.jdbc.core;


import lombok.Data;
import tk.zhangh.scalpel.jdbc.support.SQLExceptionTranslator;

import javax.sql.DataSource;

/**
 * 为JdbcTemplate提供公用属性
 * Created by ZhangHao on 17/3/21.
 */
@Data
public abstract class JdbcAccessor {
    protected DataSource dataSource;
    protected SQLExceptionTranslator sqlExceptionTranslator;
}
