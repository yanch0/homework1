package org.example.task2;

public class Student implements Printable{
    private String fullName;
    private String gradeBookNum;
    private double avgScore;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGradeBookNum() {
        return gradeBookNum;
    }

    public void setGradeBookNum(String gradeBookNum) {
        this.gradeBookNum = gradeBookNum;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student: " +
                "fullName='" + fullName + '\'' +
                ", gradeBookNum='" + gradeBookNum + '\'' +
                ", avgScore=" + avgScore;
    }

    public void print(){
        System.out.println(this.toString());
    }
}
