package inout;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedReaderWriterApp {

    public static void main(String[] args) throws IOException {

        try (BufferedWriter out = new BufferedWriter(new FileWriter("examples/out1.txt", StandardCharsets.UTF_8))) {
            IOOperations.write(out, "Hello!");
            out.flush();
        }

        try (BufferedReader in = new BufferedReader(new FileReader("examples/out1.txt", StandardCharsets.UTF_8))) {
            String text = IOOperations.read(in);
            System.out.println(text);
        }
    }
}
