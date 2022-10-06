package file;

import java.nio.file.Path;

public class PathApp {

    public static void main(String[] args) {
        // -> C:\System\Java\file.exe
        Path p1 = Path.of("C:", "System", "file.exe");
        System.out.println(p1);

        Path p2 = p1.getFileName();
        System.out.println(p2);

        Path p3 = p1.getRoot();
        System.out.println(p3);
    }
}
