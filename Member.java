package School;

import java.util.Scanner;

public abstract class Member {
    protected static Scanner input = new Scanner(System.in);
    protected String name;
    protected int yearOfBirth;
    protected String birthPlace;
    protected String address;

    public Member()
    {
        this.name = " ";
        this.yearOfBirth = 0;
        this.birthPlace = " ";
        this.address = " ";
    }

    public Member(String name, int year, String bornPlace, String address)
    {
        this.name = name;
        this.yearOfBirth = year;
        this.birthPlace = bornPlace;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.yearOfBirth = year;
    }

    public void setBornPlace(String bornPlace) {
        this.birthPlace = bornPlace;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getAddress() {
        return address;
    }

    public void input()
    {
        System.out.print("Enter name: ");
        this.name = input.nextLine();
        System.out.print("Enter year of birth: ");
        this.yearOfBirth = input.nextInt();
        input.nextLine();
        System.out.print("Enter place of birth: ");
        this.birthPlace = input.nextLine();
        System.out.print("Enter address: ");
        this.address = input.nextLine();
    }

    public void output()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Year: " + this.yearOfBirth);
        System.out.println("Birth of place: " + this.birthPlace);
        System.out.println("Address: " + this.address);
    }

}
