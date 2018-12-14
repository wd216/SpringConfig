package learning.spring.configuration1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
public class MybatisConfig {
    @Bean
    public DataSource dataSource() {
//        ComboPooledDataSource source = new ComboPooledDataSource();
        SimpleDriverDataSource source = new SimpleDriverDataSource();
        source.setUrl("jdbc:mariadb://localhost:3306/stu");
        return source;
    }
}
