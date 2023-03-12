package student;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   
        static String dbsm = "";
        // static ArrayList<String> block = new ArrayList<>();

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter student number: ");
        int n = input.nextInt();
        // int n = 1;
        input.nextLine();

        for (int i = 0;i<n;i ++){
        String block = "";
     

        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
    
        System.out.print("Enter Your Department: ");
        String dept = input.nextLine();

        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        input.nextLine();
     
        //-------------------------------------
        Student  student1 = new Student(name,age,dept);
        student1.dispalyInfo();
        System.out.println(student1.advCourse());
        student1.addCourse("CSE110","CSE220");
        System.out.println(student1.advCourse());


        // file hendling---------
        FileRead fileread = new FileRead();
        dbsm += fileread.dataPass();
        
        String str = Integer.toString(student1.age);
        block += student1.name + ",";
        block += student1.dept + ",";
        block += str+ "\n";
        dbsm+= block;
        
        
        }
        System.out.println(dbsm);
        FileWrite write = new FileWrite(dbsm);
        input.close();

    }
}
