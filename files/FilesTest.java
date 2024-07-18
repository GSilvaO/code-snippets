import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest {
    public static void main(String[] args) {
        Path path = Paths.get("FileTest");
        Path fileName =  path.getFileName();
        System.out.printf("asd",fileName);
    }
}
