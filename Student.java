
import java.util.Arrays;

public class Student extends Person{
    public String studentId;
    public String major;
    public double grade[];
    public int gradeCount;

    public Student(String name, int age, String studentId, String major) {
        super(name , age);
        this.studentId = studentId;
        this.major = major;
        this.grade = new double[3];
        this.gradeCount = 0;
    }

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public double[] getGrade() {
        return grade;
    }
    public void setGrade(double[] grade) {
        this.grade = grade;
    }

    public int getGradecount() {
        return gradeCount;
    }
    public void setGradecount(int gradeCount) {
        this.gradeCount = gradeCount;
    }

    public void addGrade(double grade) {
        if (gradeCount < 3) { // Giới hạn nhập điểm là 3
            this.grade[gradeCount] = grade;
            gradeCount++;
        } else {
            System.out.println("vượt quá số lượng nhập điểm");
        }
    }

    private double calculateAverageGrade() {
        double sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grade[i];
        }
        return (gradeCount == 0) ? 0 : sum / gradeCount;
    }

    public String tinhHocLuc() {
        double average = calculateAverageGrade();
        if (average >= 8.0) {
            return "Giỏi";
        } else if (average >= 5.0) {
            return "Khá";
        } else {
            return "Trung bình";
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + super.name + ", Age: " + super.age + ", Student ID: " + this.studentId + ", Major: " + this.major);
    }   

    public void displayGrade(){
        System.out.println("Grade: " + Arrays.toString(this.grade));
    }
}