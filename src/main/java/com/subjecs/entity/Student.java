package com.subjecs.entity;


public class Student {

  private int stuId;
  private String password;
  private String quanxian;
  private String classes;
  private String grade;


  public int getStu_Id() {
    return stuId;
  }

  public void setStu_Id(int stu_Id) {
    this.stuId = stu_Id;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getQuanxian() {
    return quanxian;
  }

  public void setQuanxian(String quanxian) {
    this.quanxian = quanxian;
  }


  public String getClasses() {
    return classes;
  }

  public void setClasses(String classes) {
    this.classes = classes;
  }


  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  @Override
  public String toString() {
    return "Student{" +
            "stu_Id=" + stuId +
            ", password='" + password + '\'' +
            ", quanxian='" + quanxian + '\'' +
            ", classes='" + classes + '\'' +
            ", grade='" + grade + '\'' +
            '}';
  }
}
