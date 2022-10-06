package inout;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderWriterApp {

    public static void main(String[] args) throws IOException {

        try (FileWriter out = new FileWriter("examples/out1.txt", StandardCharsets.UTF_8)) {
            out.write("Hello!");
        }

        try (FileReader in = new FileReader("examples/out1.txt", StandardCharsets.UTF_8)) {
            int c = in.read();
            StringBuilder text = new StringBuilder();
            while (c > -1) {
                text.append((char) c);
                c = in.read();
            }

            System.out.println(text);
        }
    }
}
