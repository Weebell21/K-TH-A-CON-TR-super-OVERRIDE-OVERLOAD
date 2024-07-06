public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("ChiLong", 20, "001", "CNTT");
        student1.addGrade(3.6);
        student1.addGrade(5.0);
        System.out.println(student1.tinhHocLuc());
        student1.displayInfo();
        System.out.println("\n");
        student1.displayGrade();
        System.out.println("\n");
    }
    
}
