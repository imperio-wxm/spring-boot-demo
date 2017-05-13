import app.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import app.pojo.Properties;

/**
 * Created by wxmimperio on 2017/5/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@EnableConfigurationProperties({Properties.class})
public class ApplicationTests {

    @Autowired
    private Properties properties;

    @Test
    public void test1() throws Exception {

        Assert.assertEquals("wxm", properties.getName());
        Assert.assertEquals("spring boot demo", properties.getTitle());
        Assert.assertEquals("wxm for spring boot demo", properties.getDesc());

        System.out.println(properties.getHost());
        System.out.println(properties.getPort());

        System.out.println("随机参数：");
        System.out.println("随机字符串 : " + properties.getValue());
        System.out.println("随机int : " + properties.getNumber());
        System.out.println("随机long : " + properties.getBignumber());
        System.out.println("随机10以下 : " + properties.getTest1());
        System.out.println("随机10-20 : " + properties.getTest2());
    }
}
