package WebService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  4/22/2018
 * Created Time -  2:24 PM
 * Project Name - core
 * Package Name - WebService
 */

@RestController
@RequestMapping(value="menu")
public class SideMenuItemController {

    @RequestMapping(value = "/load-menu", method = RequestMethod.POST)
    @ResponseBody
    public HashMap<String,Object> loadSideMenuItems() {
        HashMap<String, Object> menuMap = new HashMap<>();


        menuMap.put("home", new Object(){

        });

        return menuMap;
    }
}
