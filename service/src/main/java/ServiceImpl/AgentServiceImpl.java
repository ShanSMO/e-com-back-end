package ServiceImpl;

import Entities.Agent;
import Entities.Company;
import Repositories.AgentRepository;
import Services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  3/1/2018
 * Created Time -  1:07 PM
 * Project Name - core
 * Package Name - ServiceImpl
 */

@Service
public class AgentServiceImpl implements AgentService{

    @Autowired
    AgentRepository agentRepository;

    @Override
    public void createAgent(Agent agent) {

        agentRepository.saveAndFlush(agent);

    }
}
