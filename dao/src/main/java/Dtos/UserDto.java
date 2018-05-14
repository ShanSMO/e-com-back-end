package Dtos;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/14/2018
 * Created Time -  6:52 PM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class UserDto {

    private long id;
    private String userName;
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
