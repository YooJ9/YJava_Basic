package sec02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\javastudy\\Simple.text");
        BufferedWriter writer = null;

        try {
            writer = Files.newBufferedWriter(file);
            writer.write('a');
            writer.write('z');
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
