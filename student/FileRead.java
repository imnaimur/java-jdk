package student;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    String data = "";
    Stirng filename;
    public String dataPass(String filename){
        this.filename = filename;
        File file = new File("/Volumes/naimur/java/student/"+this.filename);

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                data += line;
            }

        } catch (FileNotFoundException e) {
            FileWrite file_create = new FileWrite(data);
        } catch (IOException e) {
            FileWrite file_create = new FileWrite(data);
        }
        return data;
    }
}

