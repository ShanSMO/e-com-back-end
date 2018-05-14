package Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/24/2018
 * Created Time -  5:49 PM
 * Project Name - core
 * Package Name - Configurations
 */

@Configuration
@ComponentScan("MailSender")
public class EmailConfiguration {

    @Bean
    public String mailboxConfig(){
        System.out.println("----------------- mailboxConfig --------------");





        return "Testing -----------";
    }
}
