package io;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriteTest {

    public static final String FILE_NAME = "test.txt";
    public static final String SENTENCE = "Hello World";

    @Test
    void should_write_in_a_file() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
             FileInputStream fileInputStream = new FileInputStream(FILE_NAME)) {
            fileOutputStream.write(SENTENCE.getBytes(StandardCharsets.UTF_8));

            int read = 0;
            StringBuilder helloworld = new StringBuilder();
            //String helloworld = "";

            while ((read = fileInputStream.read()) != -1){
                helloworld.append((char) read);
              //  helloworld += (char) read;
            }
            Assertions.assertEquals(helloworld.toString(), SENTENCE);
        //    Assertions.assertEquals(helloworld, "Salam gholamreza");
//        } catch (FileNotFoundException e) {
//            System.out.println("the file test.txt does not exist");
//            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("there is a problem with test.txt file");
            e.printStackTrace();
//        }finally {
//            try {
//                if (fileOutputStream != null)
//                fileOutputStream.close();
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
}
