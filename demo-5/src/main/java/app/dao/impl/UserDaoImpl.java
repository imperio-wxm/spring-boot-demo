package app.dao.impl;

import app.dao.UserDao;
import app.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by wxmimperio on 2017/5/14.
 */

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) throws Exception {
        String sql = "insert into user(name,age,gender) valuse(?,?,?)";
        jdbcTemplate.update(sql, user.getName(), user.getAge(), user.getGender());
    }

    @Override
    public void deleteByName(String userName) throws Exception {
        String sql = "delete from user where name = ?";
        jdbcTemplate.update(sql, userName);
    }

    @Override
    public List<User> getAllList() throws Exception {
        List<User> users = new ArrayList<>();
        String sql = "select * from user";
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> userMap : rows) {
            User user = new User();
            user.setName((String) userMap.get("name"));
            user.setAge((Integer) userMap.get("age"));
            user.setGender((String) userMap.get("gender"));
            users.add(user);
        }
        return users;
    }

    @Override
    public void deleteAll() throws Exception {
        String sql = "delete from user";
        jdbcTemplate.update(sql);
    }
}
