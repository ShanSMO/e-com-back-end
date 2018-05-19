package Configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;


/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/17/2018
 * Created Time -  8:19 PM
 * Project Name - e-com-back-end
 * Package Name - Configurations
 */

@Configuration
public class DataPopulator {

//    @Autowired
//    private DataSource dataSource;
//
//    @Value("classpath:initialData.sql")
//    private Resource schemaScript;
//
//    @Bean
//    public DataSourceInitializer dataSourceInitializer() {
//        System.out.println("--------1----------");
//        DataSourceInitializer initializer = new DataSourceInitializer();
//        initializer.setDataSource(dataSource);
//        initializer.setDatabasePopulator(databasePopulator());
//        return initializer;
//    }
//
//    private DatabasePopulator databasePopulator() {
//        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
//        populator.addScript(schemaScript);
//        return populator;
//    }
}
