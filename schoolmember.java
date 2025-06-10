//interfaces segregation principle
interface TeacherDuties {
    void teach();
    void markAttendance();
}

interface StudentDuties {
    void attendClass();
}

interface SportsDuties {
    void playSport();
}

// Implementing only what is needed
class Teacher implements TeacherDuties {
    public void teach() {
        System.out.println("Teaching subjects.");
    }

    public void markAttendance() {
        System.out.println("Marking student attendance.");
    }
}

class Student implements StudentDuties {
    public void attendClass() {
        System.out.println("Attending class.");
    }
}

class Coach implements SportsDuties {
    public void playSport() {
        System.out.println("Coaching sports.");
    }
}


