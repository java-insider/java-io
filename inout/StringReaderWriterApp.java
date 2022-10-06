package inout;

import java.io.*;

public class StringReaderWriterApp {

    public static void main(String[] args) throws IOException {
        try (Writer out = new StringWriter()) {
            IOOperations.write(out, "Hello!");
            System.out.println(out);
        }

        try (Reader in = new StringReader("Uma string qualquer")) {
            String text = IOOperations.read(in);
            System.out.println(text);
        }
    }
}
