package Configuration;

import Configurations.DozerConfiguration;
import Configurations.EmailConfiguration;
import Configurations.ORMConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/15/2018
 * Created Time -  10:14 PM
 * Project Name - ProjectPro
 * Package Name - Configurations
 */

@Configuration
@ComponentScans(value = {
    @ComponentScan("Entities"),
    @ComponentScan("Services"),
    @ComponentScan("ServiceImpl"),
    @ComponentScan("Repositories"),
    @ComponentScan("WebService"),
    @ComponentScan("Schedules")})
@EnableWebMvc
@EnableSpringDataWebSupport
@Import({EmailConfiguration.class, ORMConfiguration.class , DozerConfiguration.class , DataSourceConfiguration.class})
public class RootConfiguration {

}
