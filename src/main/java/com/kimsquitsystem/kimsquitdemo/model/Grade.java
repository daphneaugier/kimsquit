package com.kimsquitsystem.kimsquitdemo.model;


public class Grade {
    final private String gradeId;
    final private String studentId;
    final private float numberGrade;

    /**
     * Grade Constructor
     * @param courseId
     * @param studentId
     * @param numberGrade
     */
    public Grade(String courseId, String studentId, float numberGrade) {
        this.gradeId = courseId;
        this.studentId = studentId;
        this.numberGrade = numberGrade;
    }

    /**
     * get grade id
     * @return
     */
    public String getGradeId() {
        return gradeId;
    }


    /**
     * get student Id
     * @return
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * get grade
     * @return
     */
    public float getNumberGrade() {
        return numberGrade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId='" + gradeId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", numberGrade=" + numberGrade +
                '}';
    }
}
