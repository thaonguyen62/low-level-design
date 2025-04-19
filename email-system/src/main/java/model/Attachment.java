package model;

public class Attachment {
    private String fileName;
    private byte[] content;
    private String contentType;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Attachment(String fileName, byte[] content, String contentType) {
        this.fileName = fileName;
        this.content = content;
        this.contentType = contentType;
    }

    public Attachment() {
    }
}
