package student;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String name,dept;
    ArrayList<String> course;
    int age;
    static String university = "BRAC University";
    static int id = 2201000;

    public Student(String n,int a,String d){
        this.name = n;
        this.age = a;
        this.dept = d;
        Student.id += 1;
        this.course = new ArrayList<>();
    }

    public void dispalyInfo(){
        System.out.println("\n---Student Information---");
        System.out.println("Name: "+this.name);
        System.out.println("Id: "+Student.id);
        System.out.println("Department: "+this.dept);
        System.out.println("University: "+Student.university);
    }


    public void addCourse(String... course){

        for(String c:course){
            this.course.add(c);
        }
        System.out.println("------Course added-----");
    }

    public String advCourse(){
        String dis;
        int n = this.course.size();
        if(n == 0){
            return "No course have taken";
        }
        else{
            dis = String.join("\n",this.course);
            return "Course Taken: \n"+dis;
        }
    }

    public String viewCourse(){
        ArrayList<String> crs = new ArrayList<>(Arrays.asList("CSE110","CSE111","CSE220","CSE230"));
        String ret = String.join("\n",crs);
        return "Course List: "+ret;
    }

    public void remCourse(String crs){
        for(String c:this.course){
            if(c == crs){
                this.course.remove(crs);
            }
        }
    }

}
