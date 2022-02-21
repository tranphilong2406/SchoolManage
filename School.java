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

    public int the_Highest_Seniority()
    {
        int result = 0;
        for (Member member : listOfMembers) {
            String type = member.getClass().getSimpleName();
            if(type == "Teacher")
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
    
    public School list_Of_Teacher_With_Highest_Seniority()
    {
        School result = new School();
        for (Member member : listOfMembers) {
            String type = member.getClass().getSimpleName();
            if(type.equals("Teacher"))
            {
                if(((Teacher)member).seniority() == the_Highest_Seniority())
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

    public double the_Highest_Mark()
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

    public School list_Of_Student_Highest_Mark()
    {
        School result = new School();
        for (Member member : this.listOfMembers) {
            
        }
        return result;
    }
}
