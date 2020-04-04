package CodewarsSolutions.kata6;

public class ExtractFileName {
    public static String extractFileName(String dirtyFileName) {
        return dirtyFileName.substring(dirtyFileName.indexOf('_') + 1, dirtyFileName.lastIndexOf('.'));
    }

    public static void main(String[] args) {
        System.out.println(extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION"));
        System.out.println(extractFileName("1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34"));
        System.out.println(extractFileName("1231231223123131_myFile.tar.gz2"));
    }
}
