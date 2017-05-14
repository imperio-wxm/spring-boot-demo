package app.dao.impl;

import app.dao.UserDao;
import app.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    }

    @Override
    public List<User> getAllList() throws Exception {
        return null;
    }

    @Override
    public void deleteAll() throws Exception {

    }
}
