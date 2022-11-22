package School;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private int numberOfMember;
    private ArrayList<Member> listOfMembers;
    private static Scanner input = new Scanner(System.in);
    public School()
    {
        this.numberOfMember = 0;
        this.listOfMembers = new ArrayList<Member>();
    }

    public School(int numberOfMember)
    {
        this.numberOfMember = numberOfMember;
        this.listOfMembers = new ArrayList<Member>();
    }

    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }

    public void input()
    {
        System.out.print("Enter number of member: ");
        this.numberOfMember = input.nextInt();
        input.nextLine();
        Member mb = null;
        for (int i = 0; i < this.numberOfMember; i++) {
            int type;
            System.out.print("Enter type of member(1 - Teacher, 2 - Student): ");
            type = input.nextInt();
            if (type == 1) {
                mb = new Teacher();
            }
            else if(type == 2)
            {
                mb = new Student();
            }
            mb.input();
            this.listOfMembers.add(mb);
        }
    }

    public void output()
    {
        System.out.println("Number of member: " + this.numberOfMember);
        System.out.println("List of member:");
        for (Member member : listOfMembers) {
            member.output();
            System.out.println();
        }
    }

    public int theHighestSeniority()
    {
        int result = 0;
        for (Member member : listOfMembers) {
            String type = member.getClass().getSimpleName();
            if(type.equals( "Teacher"))
            {
                int temp = ((Teacher) member).seniority();
                if(temp > result)
                {
                    result = temp;
                }
            }
        }
        return result;
    }
    
    public School listOfTeacherWithHighestSeniority()
    {
        School result = new School();
        int highestSeniority = theHighestSeniority();
        for (Member member : listOfMembers) {
            String type = member.getClass().getSimpleName();
            if(type.equals("Teacher"))
            {
                if(((Teacher)member).seniority() == highestSeniority)
                {
                    result.listOfMembers.add(member);
                }
            }
        }
        result.numberOfMember = result.listOfMembers.size();
        return result;
    }

    public School listOfTeacher()
    {
        School result = new School();
        for (Member member : listOfMembers) {
            String type = member.getClass().getSimpleName();
            if(type.equals("Teacher"))
            {
                if(((Teacher)member).seniority() > 5 && ((Teacher)member).getMajor().equals("tu nhien"))
                {
                    result.listOfMembers.add(member);
                }
            }
        }

        result.numberOfMember = result.listOfMembers.size();
        return result;
    }

    public double theHighestMark()
    {
        double result = 0;
        for (Member member : listOfMembers) {
            String type = member.getClass().getSimpleName();
            if(type.equals("Student"))
            {
                if(((Student)member).averageMark() > result)
                {
                    result = ((Student)member).averageMark();
                }
            }
        }
        return result;
    }

    public School listOfStudentHighestMark()
    {
        School result = new School();
        double highestMark = theHighestMark();
        for (Member member : this.listOfMembers) {
            String type = member.getClass().getSimpleName();
            if(type.equals("Student")){
                if(((Student)member).averageMark() == highestMark){
                    result.listOfMembers.add(member);
                }
            }
        }
        result.numberOfMember = result.listOfMembers.size();
        return result;
    }

    public School listOfStudentIsGood(){
        School result = new School();
        for (Member member : this.listOfMembers) {
            String type = member.getClass().getSimpleName();
            if(type.equals("Student")){
                if(((Student)member).averageMark() > 8){
                    result.listOfMembers.add(member);
                }
            }
        }
        result.numberOfMember = result.listOfMembers.size();
        return result;
    }
}
