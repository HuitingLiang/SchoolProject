import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teacherList = new ArrayList<>();
    private ArrayList<Student> studentList = new ArrayList<>();

    private double size;
    private String name;
    private int yearBuilt;


    public void setSize(double size) {
        this.size = size;
    }


    public double getSize() {
        return size;
    }


    public void setName(String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }


    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }


    public int getYearBuilt() {
        return yearBuilt;
    }



    public School(double size, String name, int yearBuilt ){
        this.size = size;
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void deleteTeacher(Teacher teacher) {
        teacherList.remove(teacher);
    }

    public void deleteStudent(Student student) {
        studentList.remove(student);
    }

    public void showListOfTeachers() {
        for (Teacher i : teacherList) {
            System.out.println(i);
        }
    }

}
