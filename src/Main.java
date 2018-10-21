public class Main {
    public static void main(String[] args) {

        Teacher schoolTeacher = new Teacher("Jaime", "Tong", "English");
        Teacher mathTeacher = new Teacher("Daniel", "Tong", "Math");

        System.out.println(schoolTeacher);

        System.out.println(schoolTeacher.getSubject());

        Student firstStudent = new Student("Jayden", "Liao", 12);
        System.out.println(firstStudent);
        Student secondStudent = new Student("Daniel", "Lin", 3);
        System.out.println(secondStudent);
        System.out.println(firstStudent);

        System.out.println("LIST OF TEACHERS:");
        School mySchool = new School(100, "Magee", 2000);
        mySchool.addTeacher(schoolTeacher);
        mySchool.addTeacher(mathTeacher);

        mySchool.showListOfTeachers();


    }
}
