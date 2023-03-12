package student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public FileWrite(String cont){
        String filename = "/Volumes/naimur/java/student/std_data.txt";
        String content = cont;

        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

