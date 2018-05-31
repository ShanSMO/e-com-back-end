package Dtos;

import java.util.Date;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  5/27/2018
 * Created Time -  5:43 PM
 * Project Name - e-com-back-end
 * Package Name - Dtos
 */

public class SearchDto {

    private Date startDate;
    private Date endDate;
    private String searchText;
    private Object searchObject;
    private List<?> searchFilters;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public Object getSearchObject() {
        return searchObject;
    }

    public void setSearchObject(Object searchObject) {
        this.searchObject = searchObject;
    }

    public List<?> getSearchFilters() {
        return searchFilters;
    }

    public void setSearchFilters(List<?> searchFilters) {
        this.searchFilters = searchFilters;
    }
}
