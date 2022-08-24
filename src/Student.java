public class Student {
    private double gpa;
    private int studentID;
    private String school;

    public Student(double gpaParam, int idParam, String schoolParam){
        gpa = gpaParam;
        studentID = idParam;
        school = schoolParam;
    }

    public String toString() {
        return "Student info " + gpa + " " + studentID + " " + school;
    }

    public void setGpa(double newGpa) {
        gpa = newGpa;
    }

    public double getGpa() {
        return gpa;
    }
}
