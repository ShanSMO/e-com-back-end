package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/24/2018
 * Created Time -  11:33 PM
 * Project Name - core
 * Package Name - Entities
 */

@Entity
@Table(name = "TBL_AGENT")
public class Agent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "agent_id")
    private int id;

    @Column(name = "ant_first_name")
    private String agentFirstName;

    @Column(name = "agnt_last_name")
    private String agentLastName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Agent_Company",
        joinColumns = {@JoinColumn(name = "agent_id")},
        inverseJoinColumns = {@JoinColumn(name = "company_id")})
    private Set<Company> companies = new HashSet<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgentFirstName() {
        return agentFirstName;
    }

    public void setAgentFirstName(String agentFirstName) {
        this.agentFirstName = agentFirstName;
    }

    public String getAgentLastName() {
        return agentLastName;
    }

    public void setAgentLastName(String agentLastName) {
        this.agentLastName = agentLastName;
    }

    public Set<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(Set<Company> companies) {
        this.companies = companies;
    }
}
