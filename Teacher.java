package School;

import java.util.Calendar;

public class Teacher extends Member {
    private int yearBegin;
    private String major;

    public Teacher()
    {
        this.yearBegin = 0;
        this.major = " ";
    }

    public Teacher(int yearBegin, String major)
    {
        this.yearBegin = yearBegin;
        this.major = major;
    }

    public void setYearBegin(int yearBegin) {
        this.yearBegin = yearBegin;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYearBegin() {
        return yearBegin;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Enter year begin: ");
        this.yearBegin = input.nextInt();
        input.nextLine();
        System.out.print("Enter major: ");
        this.major = input.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Year begin: " + this.yearBegin);
        System.out.println("Major: " + this.major);
    }

    public int seniority()
    {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - this.yearBegin;
    }
}
