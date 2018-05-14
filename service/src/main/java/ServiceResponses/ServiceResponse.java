package ServiceResponses;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  3/3/2018
 * Created Time -  8:44 AM
 * Project Name - core
 * Package Name - ServiceResponses
 */

public class ServiceResponse  implements Serializable{

    private Object object;
    private List<?> objects ;
    private boolean status;
    private String message;
    private int recordCount;

    public boolean isStatus() {
        return status;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public List<?> getObjects() {
        return objects;
    }

    public void setObjects(List<?> objects) {
        this.objects = objects;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }
}
