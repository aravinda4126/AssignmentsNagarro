public class StudentsEnglish extends Students {

    private double marksTermPaper;
    private double marksMidterm;
    private double marksFinalExam;

    public StudentsEnglish(String firstName, String lastName, String subject, double marksTermPaper, double marksMidterm, double marksFinalExam) {
        super(firstName, lastName, subject);
        this.marksTermPaper = marksTermPaper;
        this.marksMidterm = marksMidterm;
        this.marksFinalExam = marksFinalExam;
    }

    public double getMarksTermPaper() {
        return marksTermPaper;
    }

    public void setMarksTermPaper(double marksTermPaper) {
        this.marksTermPaper = marksTermPaper;
    }

    public double getMarksMidterm() {
        return marksMidterm;
    }

    public void setMarksMidterm(double marksMidterm) {
        this.marksMidterm = marksMidterm;
    }

    public double getMarksFinalExam() {
        return marksFinalExam;
    }

    public void setMarksFinalExam(double marksFinalExam) {
        this.marksFinalExam = marksFinalExam;
    }

    public double englishFinalGrade(){

        double finalGradeEnglish =  (marksTermPaper * 0.3) + (marksMidterm * 0.3) + (marksFinalExam * 0.4);
        return finalGradeEnglish;
    }

}
