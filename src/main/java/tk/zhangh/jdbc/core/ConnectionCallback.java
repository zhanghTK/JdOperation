package tk.zhangh.jdbc.core;

import java.sql.Connection;

/**
 * 面向Connection的回调接口
 * Created by ZhangHao on 17/3/21.
 */
public interface ConnectionCallback<R> extends Callback<R, Connection>{
    @Override
    R callBack(Connection type);
}
