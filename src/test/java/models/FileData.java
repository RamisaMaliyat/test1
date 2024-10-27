package models;

import lombok.Getter;

@Getter
public class FileData {
    private String downloadFile;

    public String getDownloadFile()
    {
        return  downloadFile;
    }
}
