package sec02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResource {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\javastudy\\Simple.text");

        try(BufferedWriter writer = Files.newBufferedWriter(file)) {        // 리소스 생성 후, 자동 close 해준다.
            writer.write('a');
            writer.write('z');
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
