package School;

public class Student extends Member {
    private double mathMark;
    private double literatureMark;
    private double englishMark;

    Student()
    {
        this.mathMark = 0;
        this.literatureMark = 0;
        this.englishMark = 0;
    }

    Student(double mathMark, double literatureMark, double englishMark)
    {
        this.mathMark = mathMark;
        this.literatureMark = literatureMark;
        this.englishMark = englishMark;
    }

    public void setMathMark(double mathMark) {
        this.mathMark = mathMark;
    }

    public void setLiteratureMark(double literatureMark) {
        this.literatureMark = literatureMark;
    }

    public void setEnglishMark(double englishMark) {
        this.englishMark = englishMark;
    }

    public double getMathMark() {
        return mathMark;
    }

    public double getLiteratureMark() {
        return literatureMark;
    }

    public double getEnglishMark() {
        return englishMark;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Enter math mark: ");
        this.mathMark = input.nextDouble();
        System.out.print("Enter literature mark: ");
        this.literatureMark = input.nextDouble();
        System.out.print("Enter english mark: ");
        this.englishMark = input.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Math mark: " + this.mathMark);
        System.out.println("Literature mark: " + this.literatureMark);
        System.out.println("English mark: " + this.englishMark);
    }

    public double averageMark()
    {
        return (this.mathMark + this.literatureMark + this.englishMark) / 3;
    }
}
