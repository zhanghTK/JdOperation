package tk.zhangh.jdbc.core;


import java.sql.PreparedStatement;

/**
 * 面向PreparedStatement的回调接口
 * Created by ZhangHao on 17/3/21.
 */
public interface PreparedStatementCallback<R> extends Callback<R, PreparedStatement>{
    @Override
    R callBack(PreparedStatement type);
}
