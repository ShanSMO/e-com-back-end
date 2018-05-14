package Entities;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  4/16/2018
 * Created Time -  7:23 PM
 * Project Name - core
 * Package Name - Entities
 */

public class Image {

    private String fileName;
    private String fileSource;
    private String fileType;
    private String fileSize;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSource() {
        return fileSource;
    }

    public void setFileSource(String fileSource) {
        this.fileSource = fileSource;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }
}
