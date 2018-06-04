package Schedule;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  6/4/2018
 * Created Time -  8:09 PM
 * Project Name - e-com-back-end
 * Package Name - PACKAGE_NAME
 */

@Configuration
@EnableScheduling
public class ScheduleController {

    @Scheduled(cron = "* * * * * *" )
    public void updateRecord() {
        System.out.println("----- Shanaka  -----");
    }
}
