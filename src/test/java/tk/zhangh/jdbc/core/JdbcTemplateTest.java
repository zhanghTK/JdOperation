package tk.zhangh.jdbc.core;

import org.junit.Assert;
import org.junit.Test;
import tk.zhangh.app.BeanFactory;
import tk.zhangh.jdbc.support.SQLExceptionTranslator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JDBC操作helper测试
 * Created by ZhangHao on 17/3/23.
 */
public class JdbcTemplateTest {

    private JdbcTemplate jdbcTemplate = BeanFactory.jdbcTemplate();

    @Test
    public void testExecute() throws Exception {
        List<Map<String, Object>> result = jdbcTemplate.execute((ConnectionCallback<List<Map<String, Object>>>) connection -> {
            try {
                Statement statement = connection.createStatement();
                return doStatement(statement);
            } catch (SQLException e) {
                throw new SQLExceptionTranslator().translate("ConnectionCallback error", e);
            }
        });
        Assert.assertNotNull(result);
    }

    @Test
    public void testExecute1() throws Exception {
        List<Map<String, Object>> result = jdbcTemplate.execute((StatementCallback<List<Map<String, Object>>>) statement -> {
            try {
                return doStatement(statement);
            } catch (SQLException e) {
                throw new SQLExceptionTranslator().translate("StatementCallback error", e);
            }
        });
        Assert.assertNotNull(result);
    }

    private List<Map<String, Object>> doStatement(Statement statement) throws SQLException {
        List<Map<String, Object>> result = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM person");
        while (resultSet.next()) {
            HashMap<String, Object> node = new HashMap<>();
            node.put("id", result.get(1));
            node.put("address", result.get(2));
            node.put("age", result.get(3));
            node.put("name", result.get(4));
            result.add(node);
        }
        return result;
    }
}