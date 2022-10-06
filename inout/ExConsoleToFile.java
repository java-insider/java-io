package inout;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class ExConsoleToFile {

    public static void main(String[] args) throws IOException {

        Path pathOut = Path.of("console.txt");
        try (PrintWriter out = new PrintWriter(pathOut.toFile())) {
            while (true) {
                Scanner in = new Scanner(System.in);
                System.out.print(">> ");
                String line = in.nextLine();

                if (line.isEmpty()) {
                    break;
                }
                out.println(line);
            }
        }
    }
}
