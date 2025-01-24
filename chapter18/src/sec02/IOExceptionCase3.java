package sec02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionCase3 {
    public static void main(String[] args) {
        try {
            md3();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void md3 () throws IOException {       // IOException 예외 넘긴다고 명시!
        md4();
    }
    public static void md4 () throws IOException {
        Path file = Paths.get("C:\\javastudy\\Simple.text");
        BufferedWriter writer = null;

        writer = Files.newBufferedWriter(file);         // IOException 발생 가능
        writer.write('A');                           // IOException 발생 가능
        writer.write('Z');

        if (writer != null) {
            writer.close();                             // IOException 발생 가능
        }
    }
}
