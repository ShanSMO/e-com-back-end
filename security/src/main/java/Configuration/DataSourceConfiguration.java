package Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  3/19/2018
 * Created Time -  11:38 PM
 * Project Name - core
 * Package Name - Configuration
 */

@Configuration
public class DataSourceConfiguration {

    @Autowired
    private DataSource dataSource;

    @Value("classpath:queries.sql")
    private Resource schemaScript;

    @Bean
    public DataSourceInitializer dataSourceInitializer() {
        System.out.println("--------1----------");
        DataSourceInitializer initializer = new DataSourceInitializer();
        initializer.setDataSource(dataSource);
        initializer.setDatabasePopulator(databasePopulator());
        return initializer;
    }

    private DatabasePopulator databasePopulator() {
        System.out.println("--------2----------");
        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScript(schemaScript);
        return populator;
    }

}
