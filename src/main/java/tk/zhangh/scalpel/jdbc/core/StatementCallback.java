package tk.zhangh.scalpel.jdbc.core;

import java.sql.Statement;

/**
 * 面向Statement的回调接口
 * Created by ZhangHao on 17/3/21.
 */
public interface StatementCallback<R> extends Callback<R, Statement>{
    @Override
    R callBack(Statement type);
}
