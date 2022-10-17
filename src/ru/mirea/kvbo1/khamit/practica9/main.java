package ru.mirea.kvbo1.khamit.practica9;

public class main {
    public static void main(String[] args) {
        Student[] o = new Student[5];
        o[0] = new Student(5, "dasd1");
        o[1] = new Student(7, "dasd2");
        o[2] = new Student(5, "dasd3");
        o[3] = new Student(2, "dasd4");
        o[4] = new Student(1, "dasd5");
        System.out.println(o[0]);
        SortingStudentsByGPA.Sort(o);
        for (int k = 0; k < 5; k++) {
            System.out.println(o[k]);
        }

    }
    }

