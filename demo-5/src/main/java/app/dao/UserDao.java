package app.dao;

import app.pojo.User;

import java.util.List;

/**
 * Created by wxmimperio on 2017/5/14.
 */
public interface UserDao {

    void add(User user) throws Exception;

    void deleteByName(String userName) throws Exception;

    List<User> getAllList() throws Exception;

    void deleteAll() throws Exception;
}
