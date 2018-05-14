package Dtos;

import Entities.User;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  4/14/2018
 * Created Time -  12:13 PM
 * Project Name - core
 * Package Name - Dtos
 */

public class UserRoleDto {

    private int id;
    private String roleName;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
