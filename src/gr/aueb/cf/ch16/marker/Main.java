package gr.aueb.cf.ch16.marker;

public class Main {

    public static void main(String[] args) {
        Attachment attachment = new Attachment("vat", "pdf");
    }

    public static void archive(IArchivable iArchivable) {
        if (iArchivable instanceof Attachment) {
            System.out.println(((Attachment) iArchivable).getFilename() + ".");
                    /* + ((Attachment) iArchivable).getExtension() + "is archivable") */
        }
    }
}
