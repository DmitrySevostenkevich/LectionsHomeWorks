package org.example.ZaurTregulov.lesson8;

public class Student {
    String name;
    int course;
    int count;
    public Student(String name2,int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Student #" + count + " sozdan");
    }
}
class StudentTest{
    public static void main(String[] args) {
    Student st1 = new Student("Ivan",1);
    Student st2 = new Student("Petr",4);
    Student st3 = new Student("Masha",2);
    }
}
