package com.kimsquitsystem.kimsquitdemo.model;


public class Grade {
    private String gradeId;
    final private String studentId;
    private float numberGrade;

    /**
     * Grade Constructor
     * @param gradeId
     * @param studentId
     * @param numberGrade
     */
    public Grade(String gradeId, String studentId, float numberGrade) {
        this.gradeId = gradeId;
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
     * set grade Id
     * @param gradeId
     */
    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    /**
     * get student Id
     * @return
     */
    public String getStudentId() {
        return studentId;
    }

    public float getNumberGrade() {
        return numberGrade;
    }

    public void setNumberGrade(float numberGrade) {
        this.numberGrade = numberGrade;
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
