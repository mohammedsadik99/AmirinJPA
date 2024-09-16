package com.example;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "exams")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(name = "grade", nullable = false)
    private int grade;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "grade_saving_date")
    private Date gradeSavingDate;

    public Exam() {}

    public Exam(Student student, int grade, Date gradeSavingDate) {
        this.student = student;
        this.grade = grade;
        this.gradeSavingDate = gradeSavingDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Date getGradeSavingDate() {
        return gradeSavingDate;
    }

    public void setGradeSavingDate(Date gradeSavingDate) {
        this.gradeSavingDate = gradeSavingDate;
    }
}
