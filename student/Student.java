package student;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String dept;
    static String name;
    static ArrayList<String> course;
    int age;
    static String university = "BRAC University";
    FileRead id_read = new FileRead("id_hendle.txt");
    static int id = 2201000;

    public Student(String n,int a,String d){
        Student.name = n;
        this.age = a;
        this.dept = d;
        Student.id += 1;
        Student.course = new ArrayList<>();
    }

    public void dispalyInfo(){
        System.out.println("\n---Student Information---");
        System.out.println("Name: "+Student.name);
        System.out.println("Id: "+Student.id);
        System.out.println("Department: "+this.dept);
        System.out.println("University: "+Student.university);
    }


    public static void addCourse(String... course){

        for(String c:course){
            Student.course.add(c);
        }
        System.out.println("Congrualtions Course added!");
    }

    public String advCourse(){
        String dis;
        int n = Student.course.size();
        if(n == 0){
            return "No course have taken";
        }
        else{
            dis = String.join("\n",Student.course);
            return "Course Taken: \n"+dis;
        }
    }

    public static String viewCourse(){
        ArrayList<String> crs = new ArrayList<>(Arrays.asList("1.CSE110","2.CSE111","3.CSE220","4.CSE230"));
        String ret = String.join("\n",crs);
        return "Course List: "+ret;
    }

    public void remCourse(String crs){
        for(String c:Student.course){
            if(c == crs){
                Student.course.remove(crs);
            }
        }
    }

}
