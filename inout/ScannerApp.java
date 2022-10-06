package inout;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(Path.of("examples").resolve("in.txt"))) {
            scanner.useDelimiter("\\|");
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }

            while (scanner.hasNext()) {
                String line = scanner.next();
                System.out.println(line);
            }
        }
    }
}
