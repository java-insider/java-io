package inout;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class PrintWriterApp {

    public static void main(String[] args) throws IOException {

        try (PrintWriter out = new PrintWriter("out.txt", StandardCharsets.UTF_8)) {
            out.println("olá");
            out.println("tudo bem?");
            out.println("eu sou o Java!");
            out.format("número: %03d", 10);
        }
    }
}
