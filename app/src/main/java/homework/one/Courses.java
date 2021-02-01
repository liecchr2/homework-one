package homework.one;

public class Courses {
    String department;
    String departmentCode;
    String course;
    int courseNumber;
    int credits;

    public Courses(String department, String departmentCode, String course, int courseNumber, int credits) {
        this.department = department;
        this.departmentCode = departmentCode;
        this.course = course;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }

    //Define getters and setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s ", departmentCode, course, courseNumber, "Credit Hours: %s", credits);
    }
}
