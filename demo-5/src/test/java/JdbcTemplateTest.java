import app.Application;
import app.dao.impl.UserDaoImpl;
import app.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Random;

/**
 * Created by wxmimperio on 2017/5/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class JdbcTemplateTest {
    @Autowired
    UserDaoImpl userDao;

    @Before
    public void init() {
        try {
            // clear all users
            userDao.deleteAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void jdbcTest() {
        try {
            for (int i = 0; i < 10; i++) {
                Random rand = new Random();
                User user = new User();
                user.setName("测试姓名=" + i);
                user.setAge(i);
                int gender = rand.nextInt(2);
                if (gender == 1) {
                    user.setGender("女");
                } else {
                    user.setGender("男");
                }
                userDao.add(user);
                userDao.deleteByName("测试姓名=5");
            }
            List<User> allList = userDao.getAllList();
            System.out.println(allList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
