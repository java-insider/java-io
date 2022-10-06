package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp3 {

    public static void main(String[] args) throws IOException {

        //Path tempDir = Files.createTempDirectory("app_");
        Path tempDir = Files.createTempDirectory(Path.of(""), "app_");
        System.out.println(tempDir);

        //Path tempFile = Files.createTempFile("app_", ".temp");
        Path tempFile = Files.createTempFile(Path.of(""), "app_", null);
        System.out.println(tempFile);
    }
}
