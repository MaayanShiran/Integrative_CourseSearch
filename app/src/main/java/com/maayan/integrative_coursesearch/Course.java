package com.maayan.integrative_coursesearch;

import java.util.Arrays;

public class Course {

    private String code;
    private String name;
    private String lecturer;
    private String year;
    private String semester;
    private int[] grades;

    public Course() {
    }

    public Course(String code, String name, String year, String semester) {
        this.code = code;
        this.name = name;
        this.year = year;
        this.semester = semester;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", lecturer='" + lecturer + '\'' +
                ", year='" + year + '\'' +
                ", semester='" + semester + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
