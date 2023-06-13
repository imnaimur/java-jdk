package op;

public class Student extends Universal{
    String semister;

    public Student(String name, int id, String dept,String semester) {
        super(name, id, dept);
        this.semister = semester;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Semester: "+this.semister);
    }
    
}
