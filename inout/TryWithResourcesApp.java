package inout;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResourcesApp {

    public static void main(String[] args) {

//        FileWriter out = null;
//        try {
//            try {
//                out = new FileWriter("out.txt", StandardCharsets.UTF_8);
//                out.write("Something");
//            } finally {
//                if (out != null) {
//                    out.close();
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (FileWriter out = new FileWriter("out.txt", StandardCharsets.UTF_8)) {
            out.write("Something");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
