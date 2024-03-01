// package challanges;
/**
 * instance vriable :courseName,enrolledStudents
 * static variables :maxCapacity
 * instance mthods :enrollStudent(String studentName),unenrollStudent(String studentName)
 * static method setMaxCapacity(int capacity) 
 */
class Course {
    String courseName;
    int enrollments;
    static int maxCapacity=100;
    String [] enrolledStudents ;
    Course(String courseName){
        this.courseName=courseName;
        this.enrollments=0;
        this.enrolledStudents=new String[maxCapacity];

    }
   
    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity =maxCapacity;
    }
    void enrollStudent(String studentName){
        enrolledStudents[enrollments]=studentName;
        enrollments++;

    }
    void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollments--;


    }
}
