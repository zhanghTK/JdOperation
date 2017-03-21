package tk.zhangh.scalpel.jdbc.core;

/**
 * 回调接口
 * Created by ZhangHao on 17/3/21.
 */
public interface Callback<R, T> {
    R callBack(T type);
}
