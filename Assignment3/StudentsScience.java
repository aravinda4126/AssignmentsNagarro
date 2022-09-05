public class StudentsScience extends Students{

    private double marksAttendance;
    private double marksProject;
    private double marksMidterm;
    private double marksFinalExam;

    public StudentsScience(String firstName, String lastName, String subject, double marksAttendance, double marksProject, double marksMidterm, double marksFinalExam) {
        super(firstName, lastName, subject);
        this.marksAttendance = marksAttendance;
        this.marksProject = marksProject;
        this.marksMidterm = marksMidterm;
        this.marksFinalExam = marksFinalExam;
    }

    public double getMarksAttendance() {
        return marksAttendance;
    }

    public void setMarksAttendance(double marksAttendance) {
        this.marksAttendance = marksAttendance;
    }

    public double getMarksProject() {
        return marksProject;
    }

    public void setMarksProject(double marksProject) {
        this.marksProject = marksProject;
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

    public double scienceFinalGrade(){

        double finalGradeScience =  (marksAttendance * 0.1) + (marksProject * 0.3) + (marksMidterm * 0.3) + (marksFinalExam * 0.3);
        return finalGradeScience;
    }

}