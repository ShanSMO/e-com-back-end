package WebService;

import Entities.Agent;
import ResponseObjects.ResponseObject;
import Services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/25/2018
 * Created Time -  12:22 AM
 * Project Name - core
 * Package Name - WebService
 */

@RestController
@RequestMapping(value = "agent")
public class AgentRestController {

    @Autowired
    AgentService agentService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseObject createAgent(@RequestBody Agent agent){
        ResponseObject responseObject = new ResponseObject();
        agentService.createAgent(agent);
        return responseObject;
    }
}
