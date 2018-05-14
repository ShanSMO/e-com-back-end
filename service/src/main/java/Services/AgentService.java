package Services;

import Entities.Agent;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/25/2018
 * Created Time -  1:14 PM
 * Project Name - core
 * Package Name - Services
 */

@Transactional
public interface AgentService {

    void createAgent(Agent agent);
}
