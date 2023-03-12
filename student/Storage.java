package student;

import java.io.File;
import java.util.ArrayList;

public class Storage {
    public static ArrayList<Student> studentlist = new ArrayList<>();
    public static void main(String[] args) {
        File file = new File("/Volumes/naimur/java/student/std_data.txt");
        try{
            file.createNewFile();
        }catch(Exception exception){
            System.out.println(exception);
        }
       
    }
}
