package oop;

public class Main{
    public static void main(String[] args) {
        Student st1 = new Student("Naimur",20,"2010");
        st1.displayInfo();
        st1.setDept("CSE");
        System.out.println("---------------");
        st1.displayInfo();
    }
}