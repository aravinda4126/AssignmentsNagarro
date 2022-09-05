public class StudentsMath extends Students {

    private double quiz1;
    private double quiz2;
    private double quiz3;
    private double quiz4;
    private double quiz5;
    private double quizAverage;
    private double marksTest1;
    private double marksTest2;
    private double marksFinalExam;

    public StudentsMath(String firstName, String lastName, String subject, double quiz1, double quiz2, double quiz3, double quiz4, double quiz5, double marksTest1, double marksTest2, double marksFinalExam) {
        super(firstName,lastName, subject);
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
        this.quiz4 = quiz4;
        this.quiz5 = quiz5;
        quizAverage = (quiz1 + quiz2 + quiz3 + quiz4 + quiz5)  * 0.2;
        this.marksTest1 = marksTest1;
        this.marksTest2 = marksTest2;
        this.marksFinalExam = marksFinalExam;
    }

    public double getQuiz1() {
        return quiz1;
    }

    public void setQuiz1(double quiz1) {
        this.quiz1 = quiz1;
    }

    public double getQuiz2() {
        return quiz2;
    }

    public void setQuiz2(double quiz2) {
        this.quiz2 = quiz2;
    }

    public double getQuiz3() {
        return quiz3;
    }

    public void setQuiz3(double quiz3) {
        this.quiz3 = quiz3;
    }

    public double getQuiz4() {
        return quiz4;
    }

    public void setQuiz4(double quiz4) {
        this.quiz4 = quiz4;
    }

    public double getQuiz5() {
        return quiz5;
    }

    public void setQuiz5(double quiz5) {
        this.quiz5 = quiz5;
    }

    public double getQuizAverage() {
        return quizAverage;
    }

    public void setQuizAverage(double quizAverage) {
        this.quizAverage = quizAverage;
    }

    public double getMarksTest1() {
        return marksTest1;
    }

    public void setMarksTest1(double marksTest1) {
        this.marksTest1 = marksTest1;
    }

    public double getMarksTest2() {
        return marksTest2;
    }

    public void setMarksTest2(double marksTest2) {
        this.marksTest2 = marksTest2;
    }

    public double getMarksFinalExam() {
        return marksFinalExam;
    }

    public void setMarksFinalExam(double marksFinalExam) {
        this.marksFinalExam = marksFinalExam;
    }

    public double mathFinalGrade () {

        double finalGradeMaths = (quizAverage * 0.15) + (marksTest1 * 0.3) + (marksTest2 * 0.2) + (marksFinalExam * 0.35);
        return  finalGradeMaths;

    }


}
