# @ConfigurationProperties

- You can use @ConfigurationProperties instead of @Value
- The entity class is loaded with @EnableConfigurationProperties ({Properties.class})

```java
// use @Value
@Component
public class Properties {
    @Value("${wxmimperio.name}")
    private String name;
    @Value("${wxmimperio.title}")
    private String title;
    @Value("${wxmimperio.desc}")
    private String desc;
    .....
}
```

```java
// use @ConfigurationProperties
@ConfigurationProperties(prefix = "wxmimperio")
public class Properties {
    private String name;
    private String title;
    private String desc;
    .....
}
```

# @SpringApplicationConfiguration
- @SpringApplicationConfiguration was deprecated at 1.4.x
- You can use @SpringBootTest (classes = Application.class) instead

```java
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTests {
    .......
}
```
# spring.profiles.active

- In ***application.properties***, the ***spring.profiles.active*** parameter can load the required configuration file in a different environment
- For example:

```java
application-dev.properties
application-test.properties
application-prod.properties
```