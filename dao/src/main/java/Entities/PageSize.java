package Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/19/2018
 * Created Time -  7:48 AM
 * Project Name - e-com-back-end
 * Package Name - Entities
 */

@Entity
@Table(name = "tbl_page_size")
@JsonIgnoreProperties({"photoCopies"})
public class PageSize {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "size_value")
    private String sizeValue;

    @OneToMany(mappedBy = "pageSize")
    private Set<PhotoCopy> photoCopies;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSizeValue() {
        return sizeValue;
    }

    public void setSizeValue(String sizeValue) {
        this.sizeValue = sizeValue;
    }

    public Set<PhotoCopy> getPhotoCopies() {
        return photoCopies;
    }

    public void setPhotoCopies(Set<PhotoCopy> photoCopies) {
        this.photoCopies = photoCopies;
    }
}
