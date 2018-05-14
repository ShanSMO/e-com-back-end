package Entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  3/21/2018
 * Created Time -  8:33 PM
 * Project Name - core
 * Package Name - Entities
 */

@Entity
@Table(name = "TBL_USER_ROLE")
public class UserRole implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "role_name")
    private String roleName;

    @OneToOne(mappedBy = "role")
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
