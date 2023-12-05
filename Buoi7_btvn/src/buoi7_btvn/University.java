package buoi7_btvn;

import java.util.*;

public class University {
    private List<Student> stuList;
    private List<Course> courseList;

    public University(List<Student> stuList, List<Course> courseList) {
        this.stuList = stuList;
        this.courseList = courseList;
    }

    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
    
}
