// Students class is the base class
public class Students {

    private String firstName;
    private String lastName;
    private String subject;

    public Students(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String secondName) {
        this.lastName = secondName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // A method to compute letter-grade
    public char findLetterGrade (double finalGrade) {

        char letterGrade = 0;

        if (finalGrade > 90)
            letterGrade = 'A';
        else if (finalGrade > 80)
            letterGrade ='B';
        else if (finalGrade > 70)
            letterGrade = 'C';
        else if (finalGrade > 60)
            letterGrade = 'D';
        else if (finalGrade > 50)
            letterGrade = 'E';
        else
            letterGrade = 'F';

        return letterGrade;

    }

}
