package Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/24/2018
 * Created Time -  7:57 PM
 * Project Name - core
 * Package Name - Configurations
 */

@Configuration
@EnableJpaRepositories(basePackages = "Repositories",
    entityManagerFactoryRef = "entityManager",
    transactionManagerRef = "transactionManagerRef")
@PropertySource("classpath:db_properties.properties")
@EnableTransactionManagement
public class ORMConfiguration {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManager(Properties hibernateProperties, DataSource dataSource){
        LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
        entityManager.setPackagesToScan("Entities");
        entityManager.setDataSource(dataSource);
        entityManager.setJpaProperties(hibernateProperties);
        entityManager.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return entityManager;
    }

    @Bean
    public Properties hibernateProperties(Environment env){
        System.out.println("-------- hibernateProperties ----");
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect",env.getProperty("hibernate.dialect"));
        properties.setProperty("hibernate.show_sql",env.getProperty("hibernate.show_sql"));
        properties.setProperty("hibernate.hbm2ddl.auto",env.getProperty("hibernate.ddl_auto"));
        properties.setProperty("hibernate.format_sql",env.getProperty("hibernate.format_sql"));
        return properties;
    }

    @Bean
    public DataSource dataSource(Environment env){
        System.out.println("-------- dataSource ----");

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("db.driver"));
        dataSource.setUsername(env.getProperty("db.user_name"));
        dataSource.setPassword(env.getProperty("db.user_password"));
        dataSource.setUrl(env.getProperty("db.url"));
        return dataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManagerRef(EntityManagerFactory entityManagerFactory){
        System.out.println("-------- transactionManagerRef ----");

        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }
}
