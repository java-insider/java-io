package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp2 {

    public static void main(String[] args) throws IOException {

        Path root = Path.of("examples");

        Path d1 = root.resolve("d1");
        if (!Files.exists(d1)) {
            Files.createDirectory(d1);
        }

        Path d3 = Files.createDirectories(d1.resolve(Path.of("d2", "d3")));
        Files.createFile(d3.resolve("d3.txt"));
        Files.createFile(d3.getParent().resolve("d2.txt"));
        Files.createFile(d3.getParent().getParent().resolve("d1.txt"));
    }
}
