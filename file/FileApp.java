package file;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;

public class FileApp {

    public static void main(String[] args) {
        File file = new File(".");

        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(Arrays.toString(file.list()));

        Path path = file.toPath();
        System.out.println(path.toAbsolutePath());

        File file2 = path.toFile();
        System.out.println(file2.getAbsolutePath());
    }
}
