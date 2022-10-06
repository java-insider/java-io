package inout;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderWriterApp2 {

    public static void main(String[] args) throws IOException {

        try (FileWriter out = new FileWriter("examples/out1.txt", StandardCharsets.UTF_8)) {
            IOOperations.write(out, "Hello!");
        }

        try (FileReader in = new FileReader("examples/out1.txt", StandardCharsets.UTF_8)) {
            String text = IOOperations.read(in);
            System.out.println(text);
        }
    }
}
