package ServiceResponses;

import java.util.Date;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  6/4/2018
 * Created Time -  5:54 AM
 * Project Name - e-com-back-end
 * Package Name - ServiceResponses
 */

public class SearchRequestDto {

    private String searchText;
    private Date startDate;
    private Date endDate;
    private List<String> searchFields;

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

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

    public List<String> getSearchFields() {
        return searchFields;
    }

    public void setSearchFields(List<String> searchFields) {
        this.searchFields = searchFields;
    }
}
