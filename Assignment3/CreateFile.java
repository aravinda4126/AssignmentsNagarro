import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class CreateFile {

    // Main method
    public static void main(String[] args) {
        //Call CreteOutput method to create the output file
        CreateOutput();
    }


    public static void CreateOutput() {

        //Get the input file in default path
        File file = new File("InputFile.txt");

        //check input file is empty
        if (file.length() == 0){
            System.out.println("Input file is empty");
        }
        else {

            try {

                // Create object arraylist in each class type
                ArrayList<StudentsMath> mathList = new ArrayList<>();
                ArrayList<StudentsScience> scienceList = new ArrayList<>();
                ArrayList<StudentsEnglish> englishList = new ArrayList<>();

                //Crete character type arraylist to store letter grades
                ArrayList<Character> arrLetterGrade = new ArrayList<>();

                //BufferReader starts trying to read input file. if fails will giv an exception
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                    String line = "";  // variable "line" hold data in each row
                    int studentNumber = Integer.parseInt(br.readLine());  //read first line to check number of students in list

                    int count = 0;
                    // read only not-null values and students details.
                    while (((line = br.readLine()) != null) && count<studentNumber) {
                        String[] name = line.split(","); //read line to store student first, last name in name array
                        String firstName = name[1];
                        String lastName = name[0];
                        line = br.readLine();
                        String[] marks = line.split(" "); //read line to store students' marks in marks array
                        String subject = marks[0]; // oth element in marks array is subject name

                        switch (subject){
                            case "Math":   // store marks in maths
                                double quiz1 = Double.parseDouble(marks[1]);
                                double quiz2 = Double.parseDouble(marks[2]);
                                double quiz3 = Double.parseDouble(marks[3]);
                                double quiz4 = Double.parseDouble(marks[4]);
                                double quiz5 = Double.parseDouble(marks[5]);
                                double marksTest1 = Double.parseDouble(marks[6]);
                                double marksTest2 = Double.parseDouble(marks[7]);
                                double marksFinalExamMath = Double.parseDouble(marks[8]);

                                //Add MathStudent objects with details into mathList array
                                mathList.add(new StudentsMath(firstName, lastName, subject, quiz1, quiz2, quiz3, quiz4, quiz5, marksTest1, marksTest2, marksFinalExamMath));
                                break;

                            case "Science" :  // Store marks in Science
                                double marksAttendance = Double.parseDouble(marks[1]);
                                double marksProject = Double.parseDouble(marks[2]);
                                double marksMidterm = Double.parseDouble(marks[3]);
                                double marksFinalExamScience = Double.parseDouble(marks[4]);

                                // Add ScienceStudents objects with details into scienceList array
                                scienceList.add(new StudentsScience(firstName, lastName, subject, marksAttendance, marksProject, marksMidterm, marksFinalExamScience));
                                break;

                            case "English" :  // Store marks in English
                                double marksTermPaper = Double.parseDouble(marks[1]);
                                double marksMidtermEnglish = Double.parseDouble(marks[2]);
                                double marksFinalExamEnglish = Double.parseDouble(marks[3]);

                                // Add EnglishStudents objects with details into englishList array
                                englishList.add(new StudentsEnglish(firstName, lastName, subject, marksTermPaper, marksMidtermEnglish, marksFinalExamEnglish));
                                break;
                        }
                        count++; // after adding object into corresponding list count will be incremented
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }

                DecimalFormat df = new DecimalFormat("0.00"); //df.format will help Marks to be upto 2 decimal places

                try {
                    //PrintWriter creates an output file
                    PrintWriter writer = new PrintWriter("OutputFile.txt", "UTF-8");

                    writer.println();
                    writer.println("                       Students' Summary Report");
                    writer.println("==============================================================================================");

                    writer.println();
                    writer.println("                         < MATH CLASS >                                   ");
                    writer.println("----------------------------------------------------------------------------------------------");
                    writer.println(String.format("%-45s %15s %15s %14s", "Student_Name", "Final_Exam", "Final_Average", "Letter_Grade"));
                    writer.println("----------------------------------------------------------------------------------------------");


                    // Access objects in mathList array
                    for (int i=0; i<mathList.size(); i++){

                        String firstName = mathList.get(i).getFirstName(); // first name
                        String lastName = mathList.get(i).getLastName(); // last name
                        String finalExamMarks = df.format(mathList.get(i).getMarksFinalExam());  // final exam marks
                        String finalExamAverage = df.format(mathList.get(i).mathFinalGrade());  // final average
                        char letterGrade = mathList.get(i).findLetterGrade(mathList.get(i).mathFinalGrade()); // letter-grade using finalLetterGrade method --->        finalLetterGrade(finalGrade)
                        arrLetterGrade.add(letterGrade); // store letter-grade

                        writer.println(String.format("%-43s %15s %13s %13s", (firstName + " " + lastName), finalExamMarks, finalExamAverage, letterGrade)); //print values accordingly
                    }

                    writer.println("----------------------------------------------------------------------------------------------");
                    writer.println();
                    writer.println("                        < SCIENCE CLASS >                                   ");
                    writer.println("----------------------------------------------------------------------------------------------");
                    writer.println(String.format("%-45s %15s %15s %14s", "Student_Name", "Final_Exam", "Final_Average", "Letter_Grade"));
                    writer.println("----------------------------------------------------------------------------------------------");


                    for (int i=0; i<scienceList.size(); i++){

                        String firstName = scienceList.get(i).getFirstName(); // first name
                        String lastName = scienceList.get(i).getLastName(); // last name
                        String finalExamMarks = df.format(scienceList.get(i).getMarksFinalExam()); // final exam marks
                        String finalExamAverage = df.format(scienceList.get(i).scienceFinalGrade()); // final average
                        char letterGrade = scienceList.get(i).findLetterGrade(scienceList.get(i).scienceFinalGrade()); // letter-grade using finalLetterGrade method --->        finalLetterGrade(finalGrade)
                        arrLetterGrade.add(letterGrade);

                        writer.println(String.format("%-43s %15s %13s %13s", (firstName + " " + lastName), finalExamMarks, finalExamAverage, letterGrade)); //print values accordingly

                    }

                    writer.println("----------------------------------------------------------------------------------------------");
                    writer.println();
                    writer.println("                        < ENGLISH CLASS >                                   ");
                    writer.println("----------------------------------------------------------------------------------------------");
                    writer.println(String.format("%-45s %15s %15s %14s", "Student_Name", "Final_Exam", "Final_Average", "Letter_Grade"));
                    writer.println("----------------------------------------------------------------------------------------------");

                    for (int i=0; i<englishList.size(); i++){

                        String firstName = englishList.get(i).getFirstName(); // first name
                        String lastName = englishList.get(i).getLastName(); // last name
                        String finalExamMarks = df.format(englishList.get(i).getMarksFinalExam()); // final exam marks
                        String finalExamAverage = df.format(englishList.get(i).englishFinalGrade()); // final average
                        char letterGrade = englishList.get(i).findLetterGrade(englishList.get(i).englishFinalGrade()); // letter-grade using finalLetterGrade method --->        finalLetterGrade(finalGrade)
                        arrLetterGrade.add(letterGrade);

                        writer.println(String.format("%-43s %15s %13s %13s", (firstName + " " + lastName), finalExamMarks, finalExamAverage, letterGrade)); //print values accordingly

                    }

                    writer.println("----------------------------------------------------------------------------------------------");
                    writer.println();

                    // Here starts to count each letter-grade using arrLetterGrade array
                    // initially count = 0 and will be incremented accordingly
                    int countA = 0, countB = 0, countC = 0,  countD = 0, countE = 0, countF = 0;
                    for (int j : arrLetterGrade){
                        switch (j){
                            case 'A':
                                countA++;
                                break;
                            case 'B':
                                countB++;
                                break;
                            case 'C':
                                countC++;
                                break;
                            case 'D':
                                countD++;
                                break;
                            case 'E':
                                countE++;
                                break;
                            case 'F':
                                countF++;
                                break;
                        }
                    }

                    // print letter-grade distribution
                    writer.println("                     Letter-Grade Distribution");
                    writer.println("                 ---------------------------------");
                    writer.println("                              A :  " + countA);
                    writer.println("                              B :  " + countB);
                    writer.println("                              C :  " + countC);
                    writer.println("                              D :  " + countD);
                    writer.println("                              E :  " + countE);
                    writer.println("                              F :  " + countF);

                    System.out.println("Output file created successfully");
                    writer.close();

                }
                catch (Exception e){
                    System.out.println(e);
                }

            }
            catch (Exception e){
                System.out.println("File is not in valid format");
            }

        }

    }

}
