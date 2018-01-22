package person;

/* The Student class is obtained from the Person class, it's  inherited the name 
and date of birth from the person class and I have created 2 instance variables */
public class Student extends Person {

    private String studentID;
    int[] marks = new int[5];

    // Created a constructor which initialised th einherited instance variables, the student ID, and each of the subject marks.
    public Student(String _name, String _DoB, String _studentID, int subOne, int subTwo, int subThree, int subFour, int subFive) {
        super(_name, _DoB);
        studentID = _studentID;
        marks[0] = subOne;
        marks[1] = subTwo;
        marks[2] = subThree;
        marks[3] = subFour;
        marks[4] = subFive;
    }

    /* The method final mark calculates the students average mark from the 5 subject marks by looping through 
    the array and adding the mark to total marks, the dividing total marks by the number of marks. */
    public int getFinalMark() {
        int averageMark;
        int totalMarks = 0;

        for (int mark : marks) {
            totalMarks += mark;
        }
        averageMark = totalMarks / marks.length;
        return averageMark;
    }

    /* This method calculates and returns the students grade A - F dependent on their average mark. If the mark is greater or
    equal to 70, the student is graded A. Greater than or equal to 60, B. Greater than or equal to 50, C. In any other case, F. */
    public String getGrade() {
        int averageMark = getFinalMark();
        if (averageMark >= 70) {
            return "A";
        } else if (averageMark >= 60) {
            return "B";
        } else if (averageMark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // Returns updated data in the toString, including student ID and final mark
    public String toString() {
        return super.toString() + " Student ID: " + studentID + ". Final Mark: " + getFinalMark();
    }
}
