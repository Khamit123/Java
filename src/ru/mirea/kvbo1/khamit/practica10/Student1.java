package ru.mirea.kvbo1.khamit.practica10;

import java.util.Comparator;

public class Student1   {
    private String name="dsad";
    private String surname="asdd";
    private String spec="dsad";
    private int course=1;
    private int group=1;
    private int score=1;

    public Student1(int a) {
        score=a;
        name+=10-a;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student1(String name, String surname, String spec, int course, int group) {
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.course = course;
        this.group = group;
    }


    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", spec='" + spec + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
class StudentScoreComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        if(o1.getScore()>o2.getScore()){
            return 1;
        }
        else if(o1.getScore()<o2.getScore()){
            return -1;
        }
        return 0;
    }
}
class StudentNameComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}



