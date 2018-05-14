package Schedules;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  3/3/2018
 * Created Time -  9:39 AM
 * Project Name - core
 * Package Name - Schedules
 */

@Configuration
@EnableScheduling
public class EmailScheduler {

//    @Scheduled(cron = "*/10 * * * * *")
    public void sendLoginMails(){
        System.out.println("---------- scheduler working ------");
    }

//    @Scheduled(cron = "")
    public void generateMonthlyBill(){

    }

//    @Scheduled(cron = )
    public void deactivatePendingAccounts(){

    }

//    @Scheduled(cron = )
    public void sendVerificationEmail(){

    }
}
