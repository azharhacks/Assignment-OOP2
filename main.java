//interface segregation principle
    public class main {
     public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        Coach coach = new Coach();

        teacher.teach();
        teacher.markAttendance();
        student.attendClass();
        coach.playSport();
    }
}


