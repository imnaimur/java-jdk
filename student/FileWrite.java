package student;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public FileWrite(String cont){
        String filename = "/Volumes/naimur/java/student/"+Student.id+"_"+Student.name+".txt";
        String content = cont;

        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

