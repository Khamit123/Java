package ru.mirea.kvbo1.khamit.practica9;

 public class Student implements Comparable<Student> {
    private int gpa;
    private String name;

    public Student(int gpa, String name) {
        this.gpa = gpa;
        this.name = name;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Student o) {
        return Integer.compare(gpa, o.getGpa());


    }

     @Override
     public String toString() {
         return "Student{" +
                 "gpa=" + gpa +
                 ", name='" + name + '\'' +
                 '}';
     }
 }
