package person;

import java.util.*;

/* Undergraduate student class obtained from student class, has inherited the name, date of birth, student ID and number of marks from person 
class and student class. I have created 2 new variables year of study and program of study, to store the year of study and their program. */
public class UndergraduateStudent extends Student {

    private int year;
    private String program;

    /* A constructor which takes in the name, date of birth, student ID, the 5 ubject marks, year and program of study as arguements. 
    Setting the year and progam to the temporary year and program (constructor args) */
    public UndergraduateStudent(String _name, String _DoB, String _studentID, int subOne, int subTwo,
            int subThree, int subFour, int subFive, int _year, String _program) {
        super(_name, _DoB, _studentID, subOne, subTwo, subThree, subFour, subFive);
        year = _year;
        program = _program;
    }

    /* A method to return the student average mark from the 3 best subject marks, array sort marks sorts the marks out into its exceeding order.
    Created new variables to store the total and average marks. */
    public int getFinalMark() {
        Arrays.sort(marks);
        int totalMarks = 0;
        int averageMarks;

        /* Will add marks in index 2, 3, 4 as they are the best 3 subject marks dividing the total mark by 3 - the number of subject marks, 
        to calculate the overall average mark, then returning the average marks */
        for (int i = 2; i < marks.length; i++) {
            totalMarks += marks[i];
        }
        averageMarks = totalMarks / 3;
        return averageMarks;
    }

    /* Method to return the student grade by getting the average mark, it returns the same grade in Student clas id the final mark is greater than 
    or equal to 50. If the mark is between 40-50, it returns pass. In any other case (if its less than 40), it returns fail.  */
    public String getGrade() {
        int averageMark = getFinalMark();
//        if (averageMark >= 50) {
//            return super.getGrade();
        if (averageMark >= 40) {
            return "pass";
        } else {
            return "fail";
        }
    }

    // Returns updated toString to include studentd year and program of study
    public String toString() {
        return super.toString() + " Student Year: " + year + ". Program of study: " + program;
    }
}
