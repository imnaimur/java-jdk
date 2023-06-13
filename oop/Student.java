package oop;

public class Student{
    String name;
    int age;
    String id,dept;
  
    public Student(String name, int age, String id) {
      this.name = name;
      this.age = age;
      this.id = id;
      this.dept = null;
    }


    public void displayInfo(){
      if(this.dept == null){
        this.dept = "Not joined yet";
      }
      System.out.println("Name: "+this.name);
      System.out.println("Age: "+this.age);
      System.out.println("ID: "+this.age);
      System.out.println("Department: "+this.dept);
    }

    public void setDept(String dept){
      this.dept = dept;
    }
  }
  