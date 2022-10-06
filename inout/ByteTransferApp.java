package inout;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ByteTransferApp {

    public static void main(String[] args) throws IOException {

        try (
            //InputStream in = new ByteArrayInputStream("Java = sensacional!".getBytes(StandardCharsets.UTF_8));
            //OutputStream out = new FileOutputStream("examples/text")

            InputStream in = new FileInputStream("examples/file1.txt");
            ByteArrayOutputStream out = new ByteArrayOutputStream()
        ) {
            IOOperations.transfer(in, out);
            String str = out.toString(StandardCharsets.UTF_8);
            System.out.println(str);
        }
    }
}
