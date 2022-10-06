package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp4 {

    public static void main(String[] args) throws IOException {

        Path file = Path.of("myfile.txt");
        Files.createFile(file);

        Files.delete(file);
        //Files.deleteIfExists(file);
    }
}
