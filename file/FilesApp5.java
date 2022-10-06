package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FilesApp5 {

    public static void main(String[] args) throws IOException {

        Path from = Path.of("examples", "file1.txt");
        //Path to = from.getParent().resolve("file2.txt");
        Path to = from.getParent().resolve(Path.of("files", "file1.txt"));

        Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        Files.move(from, to, StandardCopyOption.REPLACE_EXISTING);
    }
}
