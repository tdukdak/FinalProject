public class StudentInfo {
    private String studentName;
    private String year;
    private String onTrack;

    public StudentInfo(String studentName, String year, String onTrack){
        this.studentName = studentName;
        this.year = year;
        this.onTrack = onTrack;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setOnTrack(String onTrack) {
        this.onTrack = onTrack;
    }



    public String getStudentName() {
        return studentName;
    }

    public String getYear() {
        return year;
    }

    public String  isOnTrack() {
        return onTrack;
    }

    public String toString(){
        return studentName + " is in the " + year + " grade and is " + onTrack + " track for college" ;
    }

}
