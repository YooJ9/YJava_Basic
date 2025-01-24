package sec02;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class IOExceptionCase {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\javastudy\\Simple.text");
        BufferedWriter writer = null;

        try {
            writer = Files.newBufferedWriter(file);     // IOException 발생 가능
            writer.write('A');                       // IOException 발생 가능
            writer.write('Z');                       // IOException 발생 가능

            if (writer != null) {                       // file이 열렸다는 걸 확인하는 문장
                writer.close();                         // IOException 발생 가능 (반드시 close 해야 함.)
            }
        } catch (IOException e) {                       // try, catch문을 없애면 컴파일 오류! 반드시 처리해야함.
            e.printStackTrace();

        }
    }
}