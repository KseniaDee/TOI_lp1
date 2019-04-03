package ru.mtusi.labwork1;

import javax.persistence.*;
import javax.swing.*;

@Entity
@Table(name = "Stud")
public class Student<string> extends BaseEntity {
private string LASTNAME_STUD;
private string FIRSTNAME_STUD;
private string PATRONYM_STUD;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "ID_GROUP",
nullable = false)
private group group;

public Student() {
}

    public Student(Long id, string LASTNAME_STUD, string FIRSTNAME_STUD, string PATRONYM_STUD) {
        super(id);
        this.LASTNAME_STUD = LASTNAME_STUD;
        this.FIRSTNAME_STUD = FIRSTNAME_STUD;
        this.PATRONYM_STUD = PATRONYM_STUD;
    }

    public Student() {
    }

    public string getLASTNAME_STUD() {
        return LASTNAME_STUD;
    }

    public void setLASTNAME_STUD(string LASTNAME_STUD) {
        this.LASTNAME_STUD = LASTNAME_STUD;
    }

    public string getFIRSTNAME_STUD() {
        return FIRSTNAME_STUD;
    }

    public void setFIRSTNAME_STUD(string FIRSTNAME_STUD) {
        this.FIRSTNAME_STUD = FIRSTNAME_STUD;
    }

    public string getPATRONYM_STUD() {
        return PATRONYM_STUD;
    }

    public void setPATRONYM_STUD(string PATRONYM_STUD) {
        this.PATRONYM_STUD = PATRONYM_STUD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        if (LASTNAME_STUD != null ? !LASTNAME_STUD.equals(student.LASTNAME_STUD) : student.LASTNAME_STUD != null)
            return false;
        if (FIRSTNAME_STUD != null ? !FIRSTNAME_STUD.equals(student.FIRSTNAME_STUD) : student.FIRSTNAME_STUD != null)
            return false;
        return PATRONYM_STUD != null ? PATRONYM_STUD.equals(student.PATRONYM_STUD) : student.PATRONYM_STUD == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (LASTNAME_STUD != null ? LASTNAME_STUD.hashCode() : 0);
        result = 31 * result + (FIRSTNAME_STUD != null ? FIRSTNAME_STUD.hashCode() : 0);
        result = 31 * result + (PATRONYM_STUD != null ? PATRONYM_STUD.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + getId() +
                "LASTNAME_STUD=" + LASTNAME_STUD +
                ", FIRSTNAME_STUD=" + FIRSTNAME_STUD +
                ", PATRONYM_STUD=" + PATRONYM_STUD +
                '}';
    }
}

