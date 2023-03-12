package student;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   
        static ArrayList<String> dbsm = new ArrayList<>();

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter student number: ");
        int n = input.nextInt();
        // int n = 1;
        input.nextLine();

        for (int i = 0;i<n;i ++){
     

        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
    
        System.out.print("Enter Your Department: ");
        String dept = input.nextLine();

        System.out.print("Enter Your Age: ");
        int age = input.nextInt();
     
        //-------------------------------------
        Student  student1 = new Student(name,age,dept);
        student1.dispalyInfo();
        System.out.println(student1.advCourse());
        student1.addCourse("CSE110","CSE220");
        System.out.println(student1.advCourse());
        }


        // file hendling----------------

        FileRead fileread = new FileRead();
        dbsm.add(fileread.dataPass());
        // dbsm.add(student1.name);
        System.out.println(dbsm);
        input.close();
    }
}
