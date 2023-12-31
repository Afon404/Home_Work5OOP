package model;

import java.util.List;

public class Student extends StudyGroup {
    static Integer idGenerator = 0;
    Integer studenId;

    public Student(String name, Integer bornYear) {
        super(name, bornYear);
        this.studenId = idGenerator++;
    }

    @Override
    public String toString() {
        return studenId + " " + super.toString();
    }
}
