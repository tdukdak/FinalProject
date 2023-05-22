import java.util.ArrayList;
public class Course {
    private String courseName;
    private String grade;
    private String comment;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Course(String courseName, String grade, String comment){
        this.courseName = courseName;
        this.grade = grade;
        this.comment = comment;
        courses.add(this);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public String toString(){
        return courseName + ", " + comment + ", " + grade;
    }
}
