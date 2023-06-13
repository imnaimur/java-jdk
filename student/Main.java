package student;
import java.util.Scanner;

public class Main {
   
        
        // static ArrayList<String> block = new ArrayList<>();

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c;
        System.out.println("Welcome to "+Student.university + " !!!");
        
        while (true){
            String dbsm = "";
            System.out.print("To continue press Y/y or N/n to exit: ");
            c = input.nextLine();
            if(c.equals("Y") || c.equals("y")){
                // int n = 1;
                System.out.print("Enter Your Name: ");
                String name = input.nextLine();
            
                System.out.print("Enter Your Department: ");
                String dept = input.nextLine();

                System.out.print("Enter Your Age: ");
                int age = input.nextInt();

                input.nextLine();
            
                //-------------------------------------
                Student  student1 = new Student(name,age,dept);

                // course taking--------------------
                Student.addCourse("CSE110","CSE220");

                
                // file hendling---------                
                String str = Integer.toString(student1.age);
                dbsm += Student.name + ",";
                dbsm += student1.dept + ",";
                dbsm += str+ "\n";
                for(String i:Student.course){
                    dbsm+=i+"\n";
                }
                FileWrite write = new FileWrite(dbsm);
                
                
                
            }
            else{
                System.out.println("Thank You!");
                break;
            }
    }
        input.close();
    }
}
