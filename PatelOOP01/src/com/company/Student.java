package com.company;

public class Student {
    String studentName;
    String studentYear;
    double studentGpa;

    public Student(String studentName, String studentYear, double studentGpa) {
        setStudentName(studentName);
        setStudentYear(studentYear);
        setStudentGpa(studentGpa);
    }

    private void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private void setStudentYear(String studentYear) {
        this.studentYear = studentYear;
    }

    private void setStudentGpa(double studentGpa) {
        this.studentGpa = studentGpa;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentYear() {
        return studentYear;
    }

    public double getStudentGpa() {
        return studentGpa;
    }
}