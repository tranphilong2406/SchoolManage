package School;

public class Main {
    public static void main(String[] args) {
        School sch = new School();
        sch.input();
        System.out.println();
        sch.output();

        System.out.println("Teacher with highest senority:");
        School listOfHigestSenority = sch.listOfTeacherWithHighestSeniority();
        listOfHigestSenority.output();

        System.out.println("Teacher with senority greater than 5 and have major is Tu nhien:");
        School listOfTeacherMajor = sch.listOfTeacher();
        listOfTeacherMajor.output();

        System.out.println("List of student with highest average:");
        School listOfStudentWithHighestAverage = sch.listOfStudentHighestMark();
        listOfStudentWithHighestAverage.output();

        System.out.println("List of student with good grade:");
        School listOfGoodStudent = sch.listOfStudentIsGood();
        listOfGoodStudent.output();
    }
}
