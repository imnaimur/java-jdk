package op;

public class Universal {
    String name,dept;
    int id;
    // private static int uniqueId = 0;
    public Universal(String name,int id,String dept){
        this.name = name;
        this.id = id;
        this.dept = dept;
        // Universal.uniqueId += 1;
    }

    public void printInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Department: "+this.dept);

    }
}
