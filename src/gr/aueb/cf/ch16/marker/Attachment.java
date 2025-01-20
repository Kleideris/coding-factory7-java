package gr.aueb.cf.ch16.marker;

public class Attachment implements IArchivable {
    private String filename;
    private String extension;

    public Attachment() {
    }

    public Attachment(String filename, String extension) {
        this.filename = filename;
        this.extension = extension;
    }

    public java.lang.String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getString() {
        return extension;
    }

    public void setString(String extension) {
        this.extension = extension;    }
}
