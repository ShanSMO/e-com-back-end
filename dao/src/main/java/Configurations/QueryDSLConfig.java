package Configurations;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/29/2018
 * Created Time -  7:17 AM
 * Project Name - e-com-back-end
 * Package Name - Configurations
 */
@EnableJpaRepositories(basePackages = "Repositories",
        entityManagerFactoryRef = "entityManager",
        transactionManagerRef = "transactionManagerRef")
@EnableTransactionManagement
@Configuration
public class QueryDSLConfig {

    @Bean
    public JPAQueryFactory jpaQueryFactory(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("entityManager");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        JPAQueryFactory jpaQueryFactory = new JPAQueryFactory(entityManager);
        return jpaQueryFactory;
    }

}
