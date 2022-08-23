package com.coding.model;

public class Pro {
    private int id;
    private String name;
    private int age;
    private double score;
    private int classNo;

    @Override
    public String toString() {
        return "Pro{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", classNo=" + classNo +
                '}';
    }

    public Pro(int id, String name, int age, double score, int classNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.classNo = classNo;
    }

    public Pro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }
}
